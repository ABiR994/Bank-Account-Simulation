package ui;

public class Menu {
    private static String[] option = new String[] {"Create Account", "Deposit", "Withdraw", "Display Account Info", "Show All Accounts"};

    private static String[] accountOption = new String[] {"Savings Account", "Checking Account"};

    public static void displayMenu() {
        System.out.println("\nMenu:");
            for(int i = 0; i < option.length; i++) {
                System.out.println((i + 1) + " " + option[i]);
            }
        System.out.println();
    }

    public static void displayAccountMenu() {
        System.out.println("\nAccount Type:");
            for(int i = 0; i < accountOption.length; i++) {
                System.out.println((i + 1) + " " + accountOption[i]);
            }
        System.out.println();
    }
}
