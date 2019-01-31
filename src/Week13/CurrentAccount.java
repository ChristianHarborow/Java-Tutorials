package Week13;

public class CurrentAccount {
    private double balance;
    private double overdraft;

    public CurrentAccount(double balance, double overdraft) {

        this.balance = balance;
        this.overdraft = overdraft;
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
        if (amount > 0 && this.balance - amount >= -this.overdraft) {
            this.balance -= amount;
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString(){
        String balanceString;
        String OverdraftString;
        if(this.balance < 0){
            balanceString = "Balance: -£";
        }
        else{
            balanceString = "Balance: £";
        }
        return balanceString + "\n" + overdraftString;
    }

    public static void main(String[] args) {
        CurrentAccount test = new CurrentAccount(0, 0);

    }
}
