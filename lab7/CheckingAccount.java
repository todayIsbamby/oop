package lab7;

public class CheckingAccount extends account {

    // Attributes
    private double limit;

    // Constructors
    public CheckingAccount() {

    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    @Override
    public void withdraw(double amount) {
        if (this.getBalance() - amount >= -1 * this.limit) {
            this.setBalance(this.getBalance() - amount);
        } else {
            System.out.println("Cannot withdraw from Account");
        }
    }
}