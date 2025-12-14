package services;
import account.*;
import ui.*;

public class AccountCreation {
    private static Account[] accounts = new Account[100];
    private static int count = 0;
    public static void createAccount() {
        while(true) {
            Menu.displayAccountMenu();
            int choice = InputHandler.choice();
            switch(choice) {
                case 1:
                    createSavingsAccount();
                    return;
                case 2:
                    createCheckingAccount();
                    return;
                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }
        }
    }

    public static void createSavingsAccount() {
        String accNum = InputHandler.accNum();
        String accHolder = InputHandler.accHolder();
        double accBalance = InputHandler.accBalance();
        accounts[count] = new SavingsAccount(accNum, accHolder, accBalance);
        count++;
        System.out.println("\nSavings Account created successfully!");
    }

    public static void createCheckingAccount() {
        String accNum = InputHandler.accNum();
        String accHolder = InputHandler.accHolder();
        double accBalance = InputHandler.accBalance();
        accounts[count] = new CheckingAccount(accNum, accHolder, accBalance);
        count++;
        System.out.println("\nChecking Account created successfully!");
    }

    public static Account getAccount(int index) {
        return accounts[index];
    }

    public static int getCount() {
        return count;
    }
}
