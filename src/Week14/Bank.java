package Week14;

public class Bank {

    public static void main(String[] args) {
        DepositAccount acc = new DepositAccount("Name");
        acc.deposit(10);
        acc.addInterest(10);
        System.out.println(acc.getBalance());
    }
}
