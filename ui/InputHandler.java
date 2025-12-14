package ui;
import java.util.*;

public class InputHandler {
    private static Scanner sc = new Scanner(System.in);

    public static int choice() {
        while (true) {
            System.out.print("Enter your choice: ");

            if (sc.hasNextInt()) {
                int choice = sc.nextInt();
                sc.nextLine();
                return choice;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                sc.nextLine();
            }
        }
    }

    public static void repeat() {
        while (true) {
            System.out.print("\nDo you want to continue? (y/n): ");
            String choice = sc.nextLine().trim();

            if(choice.equalsIgnoreCase("y")) {
                return;
            } else if(choice.equalsIgnoreCase("n")) {
                System.out.println("\nExiting the application. Goodbye!");
                System.exit(0);
            } else {
                System.out.println("\nInvalid choice. Please try again.");
            }
        }
    }

    public static String accNum() {
        System.out.print("Enter Account Number: ");
        String accNum = sc.nextLine();
        return accNum;
    }

    public static String accHolder() {
        System.out.print("Enter Account Holder Name: ");
        String accHolder = sc.nextLine();
        return accHolder;
    }

    public static double amountValidation() {
        while (true) {
            System.out.print("Enter Amount: ");
            if (sc.hasNextDouble()) {
                double amount = sc.nextDouble();
                sc.nextLine();
                if(amount > 0) {
                    return amount;
                } else {
                    System.out.println("Invalid input. Please enter a valid amount.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid amount.");
                sc.nextLine();
            }
        }
    }

    public static double accBalance() {
            double balance = amountValidation();
            return balance;
    }

    public static double amount() {
        System.out.println("Account found.");
            double amount = amountValidation();
            return amount;
    }
}
