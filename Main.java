import ui.*;
import services.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Banking Application!");
        while(true) {
            Menu.displayMenu();
            int choice = InputHandler.choice();
            switch(choice) {
                case 1:
                    AccountCreation.createAccount();
                    InputHandler.repeat();
                    break;
                case 2:
                    Transaction.deposit();
                    InputHandler.repeat();
                    break;
                case 3:
                    Transaction.withdraw();
                    InputHandler.repeat();
                    break;
                case 4:
                    FindAccount.displayAccountInfo();
                    InputHandler.repeat();
                    break;
                case 5:
                    FindAccount.showAllAccounts();
                    InputHandler.repeat();
                    break;
                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }
        }
    }
}
