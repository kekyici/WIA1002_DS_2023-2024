package test4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class WorkflowGraph {
    Map<String, Task> tasks = new HashMap<>();
    Map<String, List<String>> dependencies = new HashMap<>();

    public void readInputFiles(String dagPath, String jobDirectory) throws IOException {
        System.out.println("Reading DAG file from path: " + dagPath);

        // Read and parse the DAG file
        try (BufferedReader br = new BufferedReader(new FileReader(dagPath))) {
            String line;

            while ((line = br.readLine()) != null) {
                line = line.trim();

                if (line.startsWith("JOB")) {
                    String[] parts = line.split("\\s+");
                    if (parts.length == 3) {
                        Task task = new Task(parts[1], parts[2]);
                        tasks.put(parts[1], task);
                    }
                } else if (line.startsWith("PARENT")) {
                    String[] parts = line.split("\\s+");
                    List<String> parents = new ArrayList<>();
                    List<String> children = new ArrayList<>();

                    int i = 1;
                    while (!parts[i].equals("CHILD")) {
                        parents.add(parts[i++]);
                    }
                    i++;
                    while (i < parts.length) {
                        children.add(parts[i++]);
                    }

                    for (String parent : parents) {
                        dependencies.putIfAbsent(parent, new ArrayList<>());
                        dependencies.get(parent).addAll(children);
                    }
                }
            }
        }

        // Read the .sub files
        for (Task task : tasks.values()) {
            String subFilePath = jobDirectory + "/" + task.getSubFilePath();
            System.out.println("Reading job file from path: " + subFilePath);
            readSubFile(task, subFilePath);
        }
    }

    private void readSubFile(Task task, String subFilePath) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(subFilePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                line = line.trim();

                if (line.startsWith("estimate_runtime")) {
                    String[] parts = line.split("=");
                    if (parts.length == 2) {
                        int runtime = Integer.parseInt(parts[1].trim());
                        task.setEstimatedRunTime(runtime);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + subFilePath);
            throw e;
        }
    }

    // Example method to get sorted tasks (not fully implemented)
    public List<String> getSortedTasks() {
        List<String> sortedTasks = new ArrayList<>(tasks.keySet());
        sortedTasks.sort(Comparator.comparingInt(task -> tasks.get(task).getEstimatedRunTime()));
        return sortedTasks;
    }

    // Example method to find critical path (not fully implemented)
    public Map.Entry<List<String>, Integer> findCriticalPath() {
        // Implement your critical path algorithm here
        return new AbstractMap.SimpleEntry<>(new ArrayList<>(), 0);
    }

    // Task class (example implementation)
    class Task {
        private String taskName;
        private String subFilePath;
        private int estimatedRunTime;

        public Task(String taskName, String subFilePath) {
            this.taskName = taskName;
            this.subFilePath = subFilePath;
        }

        public String getTaskName() {
            return taskName;
        }

        public String getSubFilePath() {
            return subFilePath;
        }

        public int getEstimatedRunTime() {
            return estimatedRunTime;
        }

        public void setEstimatedRunTime(int estimatedRunTime) {
            this.estimatedRunTime = estimatedRunTime;
        }
    }
}
