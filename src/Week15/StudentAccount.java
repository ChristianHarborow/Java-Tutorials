package Week15;

public class StudentAccount extends BankAccount {
    private double overdraft;

    public StudentAccount(String accountHolder) {
        super(accountHolder);
        this.overdraft = 500;
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
