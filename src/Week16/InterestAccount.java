package Week16;

abstract class InterestAccount extends BankAccount{

    public InterestAccount(String accountHolder) {
        super(accountHolder);
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
