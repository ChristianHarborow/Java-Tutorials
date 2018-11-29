package Week09;

public class BankAccountDemo {
    public static void main (String[] args) {
        BankAccount account = new BankAccount("1234", "John Smith", false);
        System.out.println(account);
        //testing over withdrawal condition
        if (account.withdraw(100.00)) {
            System.out.println("Withdrawal successful");
        }
        else {
            System.out.println("Withdrawal failed");
        }
        account.setHasOverdraft(true);
        //testing withdrawal overdraft condition
        if (account.withdraw(100.00)) {
            System.out.println("Withdrawal successful");
        }
        else {
            System.out.println("Withdrawal failed");
        }
        //testing interest negative balance condition
        if (account.addInterest(5)) {
            System.out.println("Interest added");
        }
        else {
            System.out.println("Interest could not be payed");
        }
        //testing negative deposit condition
        if (account.deposit(-150.00)) {
            System.out.println("Amount deposited");
        }
        else {
            System.out.println("Unable to deposit amount");
        }
    }
}
