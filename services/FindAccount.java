package services;
import ui.*;

public class FindAccount {
    public static int findAccountIndex(String accountNumber) {
        for(int i = 0; i < AccountCreation.getCount(); i++) {
            if(AccountCreation.accounts[i].getAccountNumber().equalsIgnoreCase(accountNumber)) {
                return i;
            }
        }
        return -1;
    }

    public static void displayAccountInfo() {
        if(AccountCreation.getCount() != 0) {
            System.out.println("\nDisplay Account Info:");
            String accNum = InputHandler.accNum();
            int index = findAccountIndex(accNum);
            if(index != -1) {
                AccountCreation.accounts[index].displayInfo();
            } else {
                System.out.println("\nAccount not found.");
            }
        } else {
            System.out.println("\nNo Accounts Registered.");
        }
    }

    public static void showAllAccounts() {
        if(AccountCreation.getCount() != 0) {
            System.out.println("\n=====Accounts List=====");
            for(int i = 0; i < AccountCreation.getCount(); i++) {
                AccountCreation.accounts[i].displayInfo();
            }
        } else {
            System.out.println("\nNo Accounts Registered.");
        }
    }
}
