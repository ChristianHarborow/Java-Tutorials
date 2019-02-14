package Week15;

import java.util.ArrayList;

public class Bank {
    private ArrayList<BankAccount> accounts = new ArrayList<>();

    public Bank() {
    }

    public void addAccount(BankAccount account){
        this.accounts.add(account);
    }

    public void printTotalBalance(){
        double totalBalance = 0;
        for(BankAccount account:this.accounts){
            totalBalance += account.getBalance();
        }
        System.out.println("Total Balance Of All Accounts: " + totalBalance);
    }

    public void printAccount(BankAccount account){
            System.out.println(account.getAccountHolder() + " " + account.getBalance());
    }

    public void printAccounts(){
        for(BankAccount account:this.accounts){
            printAccount(account);
        }
    }

    public void printOverdrawnAccounts(){
        for(BankAccount account:this.accounts){
            if (account.getBalance() < 0){
                printAccount(account);
            }
        }
    }

    public void printStudentAccounts(){
        for(BankAccount account:this.accounts){
            if (account instanceof StudentAccount){
                printAccount(account);
            }
        }
    }


    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addAccount(new CurrentAccount("John Smith", 1000));
        bank.addAccount(new DepositAccount("Joe Bloggs"));
        bank.addAccount(new StudentAccount("Ben Clarke"));
        bank.addAccount(new YoungSaversAccount("Jake Brown"));

        bank.printTotalBalance();
        bank.printAccounts();
        bank.printOverdrawnAccounts();
        bank.printStudentAccounts();
    }
}
