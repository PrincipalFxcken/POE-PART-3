/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registration.and.login.feature;
import javax.swing.JOptionPane;
/**
 *
 * @author RC_Student_lab
 */
public class taskmanagementsystem {
    private static String[] developers = new String[100];
    private static String[] taskNames = new String[100];
    private static int[] taskIDs = new int[100];
    private static int[] taskDurations = new int[100];
    private static String[] taskStatuses = new String[100];
    private static int taskCount = 0;
    
    public static void taskmanagementsystem() {
        // TODO code application logic here
        int numTasks = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of tasks:"));
        
        for (int i = 0; i < numTasks; i++) {
            developers[i] = JOptionPane.showInputDialog(null, "Enter developer name for task " + (i + 1) + ":");
            taskNames[i] = JOptionPane.showInputDialog(null, "Enter task name for task " + (i + 1) + ":");
            taskIDs[i] = generateTaskID();
            taskDurations[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter task duration for task " + (i + 1) + ":"));
            taskStatuses[i] = JOptionPane.showInputDialog(null, "Enter task status for task " + (i + 1) + ":");
            taskCount++;
        }
        
        // Display tasks with status "Done"
        displayTasksWithStatus("Done");
        
        // Display developer and duration of the task with the longest duration
        displayLongestTask();
        
        // Search for a task by name and display its details
        String searchTaskName = JOptionPane.showInputDialog(null, "Enter task name to search:");
        displayTaskDetails(searchTaskName);
        
        // Search for tasks assigned to a developer and display their details
        String searchDeveloper = JOptionPane.showInputDialog(null, "Enter developer name to search:");
        displayTasksByDeveloper(searchDeveloper);
        
        // Delete a task by name
        String deleteTaskName = JOptionPane.showInputDialog(null, "Enter task name to delete:");
        deleteTask(deleteTaskName);
        
        // Display the full report of all tasks
        displayReport();
    }
    
    private static int generateTaskID() {
        // Code to generate a unique task ID
        return taskCount + 1;
    }
    
    private static void displayTasksWithStatus(String status) {
        // Code to display tasks with a specific status
    }
    
    private static void displayLongestTask() {
        // Code to display the task with the longest duration
    }
    
    private static void displayTaskDetails(String taskName) {
        // Code to search for a task by name and display its details
    }
    
    private static void displayTasksByDeveloper(String developer) {
        // Code to search for tasks assigned to a developer and display their details
    }
    
    private static void deleteTask(String taskName) {
        // Code to delete a task by name
    }
    
    private static void displayReport() {
        // Code to display the full report of all tasks
    }

}
