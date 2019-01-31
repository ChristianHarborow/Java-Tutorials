package Week13;

public class YoungSaversAccount {
    private double balance;

    public YoungSaversAccount(double balance) {
        this.balance = balance;
    }

    public boolean deposit (double amount) {
        if (amount > 0 && this.balance + amount <= 100) {
            this.balance += amount;
            return true;
        }
        else {
            return false;
        }
    }

    public boolean withdraw (double amount) {
        if (amount > 0 && this.balance - amount >= 0) {
            this.balance -= amount;
            return true;
        }
        else {
            return false;
        }
    }

    public boolean addInterest(double rate){
        if (rate >= 0 && this.balance > 0){
            this.balance += this.balance * rate / 100;
            return true;
        }
        else{
            return false;
        }
    }
}
