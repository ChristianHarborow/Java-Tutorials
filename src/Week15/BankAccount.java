package Week15;

abstract class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder){
        this.accountHolder = accountHolder;
        this.balance = 0;
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
        if (amount > 0 && this.balance - amount >= 0) {
            this.balance -= amount;
            return true;
        }
        else {
            return false;
        }
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}
