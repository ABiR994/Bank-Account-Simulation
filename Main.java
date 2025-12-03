import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static Account[] accounts = new Account[100];
    static int count = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to the Banking Application!");
        while(true) {
            System.out.println("\nMenu:");
            System.out.println("1. Create Savings Account");
            System.out.println("2. Create Checking Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Display Account Info");
            System.out.println("6. Show All Accounts");
            System.out.println("7. Exit");
            System.out.print("\nChoose an option: ");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    createSavingsAccount();
                    break;
                case 2:
                    createCheckingAccount();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdraw();
                    break;
                case 5:
                    displayAccountInfo();
                    break;
                case 6:
                    showAllAccounts();
                    break;
                case 7:
                    System.out.println("\nExiting the application. Goodbye!");
                    return;
                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }
        }
    }

    static void createSavingsAccount() {
        System.out.println("\nCreating a Savings Account:");
        System.out.print("Enter Account Number: ");
        int accNum = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Account Holder Name: ");
        String accHolder = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();
        accounts[count] = new SavingsAccount(accNum, accHolder, balance);
        count++;
        System.out.println("\nSavings Account created successfully!");
    }

    static void createCheckingAccount() {
        System.out.println("\nCreating a Checking Account:");
        System.out.print("Enter Account Number: ");
        int accNum = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Account Holder Name: ");
        String accHolder = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();
        accounts[count] = new CheckingAccount(accNum, accHolder, balance);
        count++;
        System.out.println("\nChecking Account created successfully!");
    }

    static int findAccountIndex(int accountNumber) {
        for(int i = 0; i < count; i++) {
            if(accounts[i].getAccountNumber() == accountNumber) {
                return i;
            }
        }
        return -1;
    }

    static void deposit() {
        System.out.println("\nDeposit:");
        System.out.print("Enter Account Number: ");
        int accNum = sc.nextInt();
        int index = findAccountIndex(accNum);
        if(index != -1) {
            System.out.print("Enter Deposit Amount: ");
            double amount = sc.nextDouble();
            accounts[index].deposit(amount);
            System.out.println("\nDeposit successful!");
            System.out.println("\nUpdated Balance: " + accounts[index].getBalance());
        } else {
            System.out.println("\nAccount not found.");
        }
    }

    static void withdraw() {
        System.out.println("\nWithdraw:");
        System.out.print("Enter Account Number: ");
        int accNum = sc.nextInt();
        int index = findAccountIndex(accNum);
        if(index != -1) {
            System.out.print("Enter Withdrawal Amount: ");
            double amount = sc.nextDouble();
            accounts[index].withdraw(amount);
        } else {
            System.out.println("\nAccount not found.");
        }
    }

    static void displayAccountInfo() {
        System.out.println("\nDisplay Account Info:");
        System.out.print("Enter Account Number: ");
        int accNum = sc.nextInt();
        int index = findAccountIndex(accNum);
        if(index != -1) {
            accounts[index].displayInfo();
        } else {
            System.out.println("\nAccount not found.");
        }
    }

    static void showAllAccounts() {
        System.out.println("\n=====Accounts List=====");
        for(int i = 0; i < count; i++) {
            accounts[i].displayInfo();
        }
    }
}
