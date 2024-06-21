package test4;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java test4.Main <dag_file_path> <sub_files_path>");
            return;
        }

        String dagFilePath = args[0];
        String subFilesPath = args[1];

        WorkflowGraph workflowGraph = new WorkflowGraph();
        try {
            workflowGraph.readInputFiles(dagFilePath, subFilesPath);

            List<String> sortedTasks = workflowGraph.getSortedTasks();
            System.out.println("Tasks sorted by estimated run time:");
            for (String taskName : sortedTasks) {
                WorkflowGraph.Task task = workflowGraph.tasks.get(taskName); // Updated line
                System.out.println("Task " + task.getTaskName() + " : " + task.getEstimatedRunTime());
            }

            Map.Entry<List<String>, Integer> criticalPathResult = workflowGraph.findCriticalPath();
            List<String> criticalPath = criticalPathResult.getKey();
            int totalRunTime = criticalPathResult.getValue();

            System.out.println("Critical Path: " + String.join(" -> ", criticalPath));
            System.out.println("Total Run Time: " + totalRunTime);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
