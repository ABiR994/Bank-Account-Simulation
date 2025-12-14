package account;

public class CheckingAccount extends Account {
    public CheckingAccount() {
        super();
    }

    public CheckingAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Account Type: Checking Account");
        System.out.println("-----------------------");
    }
}
