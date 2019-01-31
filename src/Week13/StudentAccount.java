package Week13;

public class StudentAccount {
    private double balance;
    private double overdraft;

    public StudentAccount(double balance) {

        this.balance = balance;
        this.overdraft = 500;
    }

    public boolean deposit (double amount) {
        if (amount > 0) {
            this.balance += amount;
            return true;
        }
        else {
            return false;
        }
    }

    public boolean withdraw (double amount) {
        if (amount > 0 && this.balance - amount >= -this.overdraft) {
            this.balance -= amount;
            return true;
        }
        else {
            return false;
        }
    }
}
