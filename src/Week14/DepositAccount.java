package Week14;

public class DepositAccount extends BankAccount{

    public DepositAccount(String accountHolder){
        super(accountHolder);
    }

    public boolean addInterest(double rate){
        if (rate >= 0 && this.getBalance() > 0){
            this.setBalance(this.getBalance() * (rate / 100 + 1));
            return true;
        }
        else{
            return false;
        }
    }
}
