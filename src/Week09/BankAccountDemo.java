package Week09;

public class BankAccountDemo {
    public static void main (String[] args) {
        BankAccount account = new BankAccount("1234", "John Smith", false);
        System.out.println(account);
        //testing withdrawal with no overdraft case
        System.out.println("Test 1 [Expecting Fail]\nAttempting withdrawal...");
        if (account.withdraw(100.00)) {
            System.out.println("Withdrawal successful\n");
        }
        else {
            System.out.println("Withdrawal failed\n");
        }
        account.setHasOverdraft(true);
        //testing withdrawal with overdraft case
        System.out.println("Test 2 [Expecting Success]\nAttempting withdrawal...");
        if (account.withdraw(100.00)) {
            System.out.println("Withdrawal successful\n");
        }
        else {
            System.out.println("Withdrawal failed\n");
        }
        //testing interest on negative balance case
        System.out.println("Test 3 [Expecting Fail]\nCalculating interest...");
        if (account.addInterest(5)) {
            System.out.println("Interest added\n");
        }
        else {
            System.out.println("Interest could not be payed\n");
        }
        //testing negative deposit case
        System.out.println("Test 4 [Expecting Fail]\nAttempting deposit...");
        if (account.deposit(-150.00)) {
            System.out.println("Amount deposited\n");
        }
        else {
            System.out.println("Unable to deposit amount\n");
        }
        //testing valid deposit case
        System.out.println("Test 5 [Expecting Success]\nAttempting deposit...");
        if (account.deposit(150.00)) {
            System.out.println("Amount deposited\n");
        }
        else {
            System.out.println("Unable to deposit amount\n");
        }
        //testing negative interest rate case
        System.out.println("Test 6 [Expecting Fail]\nCalculating interest...");
        if (account.addInterest(-5)) {
            System.out.println("Interest added\n");
        }
        else {
            System.out.println("Interest could not be payed\n");
        }
        //testing valid interest case
        System.out.println("Test 7 [Expecting Success]\nCalculating interest...");
        if (account.addInterest(5)) {
            System.out.println("Interest added\n");
        }
        else {
            System.out.println("Interest could not be payed\n");
        }
    }
}
