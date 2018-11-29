package Week09;

public class BankAccountDemo
{
    public static void main (String[] args)
    {
        BankAccount account = new BankAccount("117", "John Smith", true);
        account.withdraw(100.5);
        System.out.println(account);
        account.deposit(1037.75);
        System.out.println(account);
        account.addInterest(5);
        System.out.println(account);
    }
}
