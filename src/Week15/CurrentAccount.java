package Week15;

public class CurrentAccount extends BankAccount {
    private double overdraft;

    public CurrentAccount(String accountHolder, double overdraft){
        super(accountHolder);
        this.overdraft = overdraft;
    }

    @Override
    public boolean withdraw(double amount){
        if (amount > 0 && this.balance - amount >= -this.overdraft) {
            this.balance -= amount;
            return true;
        }
        else {
            return false;
        }
    }
}
