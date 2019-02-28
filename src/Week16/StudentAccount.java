package Week16;

public class StudentAccount extends BankAccount {
    private double overdraft;

    public StudentAccount(String accountHolder) {
        super(accountHolder);
        this.overdraft = 500;
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
