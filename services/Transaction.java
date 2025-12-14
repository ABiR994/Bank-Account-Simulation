package services;
import ui.*;

public class Transaction {
    public static void deposit() {
        if(AccountCreation.getCount() != 0) {
            System.out.println("\nDeposit:");
            String accNum = InputHandler.accNum();
            int index = FindAccount.findAccountIndex(accNum);
            if(index != -1) {
                double amount = InputHandler.amount();
                AccountCreation.getAccount(index).deposit(amount);
            } else {
                System.out.println("\nAccount not found.");
            }
        } else {
            System.out.println("\nNo Accounts Registered.");
        }
    }

    public static void withdraw() {
        if(AccountCreation.getCount() != 0) {
            System.out.println("\nWithdraw:");
            String accNum = InputHandler.accNum();
            int index = FindAccount.findAccountIndex(accNum);
            if(index != -1) {
                double amount = InputHandler.amount();
                AccountCreation.getAccount(index).withdraw(amount);
            } else {
                System.out.println("\nAccount not found.");
            }
        } else {
            System.out.println("\nNo Accounts Registered.");
        }
    }
}
