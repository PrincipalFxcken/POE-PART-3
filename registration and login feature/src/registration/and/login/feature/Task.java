/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registration.and.login.feature;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author RC_Student_lab
 */
public class Task {
    private static ArrayList<String> tasks = new ArrayList<>();
    private static String username;
    private static String password;
    /**
     * @param args the command line arguments
     */
    public static void Task (){
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to EasyKanban");
        System.out.println("Please enter the number of tasks you want to add: ");
        int numTasks = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        for (int i = 0; i < numTasks; i++) {
            System.out.println("Enter task " + (i + 1) + ":");
            tasks.add(scanner.nextLine());
        }

        while (true) {
            System.out.println("Choose one of the following options:");
            System.out.println("1. Add Tasks");
            System.out.println("2. Show Report (Coming Soon)");
            System.out.println("3. Quit");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (option) {
                case 1:
                    if (isLoggedIn()) {
                        addTasks(scanner);
                    } else {
                        System.out.println("Please log in first");
                    }
                    break;
                case 2:
                    System.out.println("Coming Soon");
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }
        }
    }

    private static boolean isLoggedIn() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your username:");
        String inputUsername = scanner.nextLine();
        System.out.println("Enter your password:");
        String inputPassword = scanner.nextLine();

        return inputUsername.equals(username) && inputPassword.equals(password);
    }

    private static void addTasks(Scanner scanner) {
        Scanner scanner1 = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a new task (or 'done' to finish adding tasks):");
            String task = scanner1.nextLine();
            if (task.equals("done")) {
                break;
            }
            tasks.add(task);
        }
    }
    
}

