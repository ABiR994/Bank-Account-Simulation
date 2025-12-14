package account;

public class SavingsAccount extends Account {
    private static final double minimumBalance = 500.0;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    public void withdraw(double amount) {
        double balance = getBalance() - amount;
        if(amount >= 0 && amount <= (getBalance() - minimumBalance)) {
            setBalance(balance);
            System.out.println("\nWithdrawal successful!");
            System.out.println("\nUpdated Balance: " + getBalance());
        } else {
            System.out.println("Insufficient funds. Minimum balance of " + minimumBalance + " must be maintained.");
        }
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Account Type: Savings Account");
        System.out.println("-----------------------");
    }
}