public class CheckingAccount extends Account {
    CheckingAccount() {
        super();
    }

    CheckingAccount(int accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Account Type: Checking Account");
        System.out.println("-----------------------");
    }
}
