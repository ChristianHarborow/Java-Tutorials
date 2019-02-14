package Week15;

public class YoungSaversAccount extends BankAccount {

    public YoungSaversAccount(String accountHolder) {
        super(accountHolder);
    }


    @Override
    public boolean deposit (double amount) {
        if (amount > 0 && amount + this.getBalance() <= 100) {
            this.setBalance(this.getBalance() + amount);
            return true;
        }
        else {
            return false;
        }
    }

    public boolean addInterest(double rate) {
        if (rate >= 0 && this.getBalance() > 0) {
            this.setBalance(this.getBalance() * (rate / 100 + 1));
            return true;
        }
        else {
            return false;
        }
    }
}
