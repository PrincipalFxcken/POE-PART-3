/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registration.and.login.feature;
import java.util.Scanner;
import java.util.regex.*;
/**
 *
 * @author RC_Student_lab
 */
public class RegistrationAndLoginFeature {

    /**
     * @param args the command line arguments
     */
        private static String username;
        private static String password;
        private static String firstName;
        private static String lastName;
        
        public static void main(String[] args) {
            Task.Task();
            taskmanagementsystem.taskmanagementsystem();
        // TODO code application logic here
            Scanner scanner = new Scanner(System.in);
        
            // Account Creation
            System.out.println("Welcome to Account Creation System!");
            System.out.print("Enter username: ");
            username = scanner.nextLine();
            System.out.print("Enter password: ");
            password = scanner.nextLine();
            System.out.print("Enter first name: ");
            firstName = scanner.nextLine();
            System.out.print("Enter last name: ");
            lastName = scanner.nextLine();

        // Validate username and password
        if (isValidUsername(username) && isValidPassword(password)) {
            System.out.println("Account created successfully!");
            // Login 
            System.out.println("Login to your account:");
            if (login()) {
                System.out.println("Welcome " + firstName + lastName + "! It's great to see you again.");
            } else {
                System.out.println("Username or password is incorrect. Please try again.");
            }
        } else {
            System.out.println("Account creation failed. Please check if username and password meets all the requirements needed to create an account.");
        }
        
    }

    // Method to validate username
    public static boolean isValidUsername(String username) {
        return username.length() <= 5 && username.contains("_");
    }

    // Method to validate password
    public static boolean isValidPassword(String password) {
        String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$";
        return Pattern.matches(pattern, password);
    }

    // Method to simulate login
    public static boolean login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();
        return inputUsername.equals(username) && inputPassword.equals(password);
    }
        
}
