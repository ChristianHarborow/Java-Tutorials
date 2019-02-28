package Week16;

public class YoungSaversAccount extends InterestAccount {

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
}
