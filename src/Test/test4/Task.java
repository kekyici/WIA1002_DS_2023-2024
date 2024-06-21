/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test4;
 import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author YiCi Kek
 */
public class Task {

    private String taskName;
    private int estimatedRunTime;
    private List<String> dependencies;

    public Task(String taskName, int estimatedRunTime) {
        this.taskName = taskName;
        this.estimatedRunTime = estimatedRunTime;
        this.dependencies = new ArrayList<>();
    }

    public String getTaskName() {
        return taskName;
    }

    public int getEstimatedRunTime() {
        return estimatedRunTime;
    }

    public List<String> getDependencies() {
        return dependencies;
    }

    public void addDependency(String dependency) {
        dependencies.add(dependency);
    }
}


