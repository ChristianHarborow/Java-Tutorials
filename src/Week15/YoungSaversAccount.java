package Week15;

public class YoungSaversAccount extends BankAccount {

    public YoungSaversAccount(String accountHolder) {
        super(accountHolder);
    }


    @Override
    public boolean deposit (double amount) {
        if (amount > 0 && amount + this.balance <= 100) {
            this.balance += amount;
            return true;
        }
        else {
            return false;
        }
    }

    public boolean addInterest(double rate) {
        if (rate >= 0 && this.balance > 0) {
            this.balance *= rate / 100 + 1;
            return true;
        }
        else {
            return false;
        }
    }
}
