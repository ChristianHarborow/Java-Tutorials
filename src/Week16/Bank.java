package Week16;

import java.util.ArrayList;

public class Bank {
    private ArrayList<BankAccount> accounts = new ArrayList<>();

    public Bank() {
    }

    public void addAccount(BankAccount account){
        this.accounts.add(account);
    }

    public BankAccount getAccount(int index){
        if (index < accounts.size()){
            return accounts.get(index);
        }
        else {
            return null;
        }
    }

    public void printTotalBalance(){
        double totalBalance = 0;
        for(BankAccount account:this.accounts){
            totalBalance += account.getBalance();
        }
        System.out.println("Total Balance Of All Accounts: " + totalBalance);
        System.out.println("========================================");
    }

    public void printAccount(BankAccount account){
            System.out.println(account.getAccountHolder() + " " + account.getBalance());
    }

    public void printAccounts(){
        System.out.println("All Bank Accounts:");
        for(BankAccount account:this.accounts){
            printAccount(account);
        }
        System.out.println("========================================");
    }

    public void printOverdrawnAccounts(){
        System.out.println("All Overdrawn Accounts:");
        for(BankAccount account:this.accounts){
            if (account.getBalance() < 0){
                printAccount(account);
            }
        }
        System.out.println("========================================");
    }

    public void printStudentAccounts(){
        System.out.println("All Student Accounts:");
        for(BankAccount account:this.accounts){
            if (account instanceof StudentAccount){
                printAccount(account);
            }
        }
        System.out.println("========================================");
    }

    public void applyAllInterest(double rate){
        for (BankAccount account:accounts){
            if (account instanceof InterestAccount){
                ((InterestAccount) account).addInterest(rate);
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
        bank.getAccount(2).withdraw(50);
        bank.printOverdrawnAccounts();
        bank.printStudentAccounts();
        bank.getAccount(1).deposit(100);
        bank.getAccount(3).deposit(100);
        bank.applyAllInterest(5);
        bank.printAccounts();
    }
}
