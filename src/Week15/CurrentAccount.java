package Week15;

public class CurrentAccount extends BankAccount {
    private double overdraft;

    public CurrentAccount(String accountHolder, double overdraft){
        super(accountHolder);
        this.overdraft = overdraft;
    }

    @Override
    public boolean withdraw(double amount){
        if (amount > 0 && this.getBalance() - amount >= -this.overdraft) {
            this.setBalance(this.getBalance() - amount);
            return true;
        }
        else {
            return false;
        }
    }
}
