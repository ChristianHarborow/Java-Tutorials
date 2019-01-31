package Week09;

public class BankAccountOptional
{
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private boolean hasOverdraft;

    public BankAccountOptional(String accountNumber, String accountHolder, boolean hasOverdraft)
    {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.hasOverdraft = hasOverdraft;
    }

    public BankAccountOptional(String accountHolder)
    {
        this.accountHolder = accountHolder;
        this.balance = 0;
        this.hasOverdraft = false;
        this.accountNumber = new BankAccountRandom().getAccountNumber();
    }

    public String getAccountNumber ()
    {
        return accountNumber;
    }

    public void setAccountNumber (String accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder ()
    {
        return accountHolder;
    }

    public void setAccountHolder (String accountHolder)
    {
        this.accountHolder = accountHolder;
    }

    public double getBalance ()
    {
        return balance;
    }

    public void setBalance (double balance)
    {
        this.balance = balance;
    }

    public boolean isHasOverdraft ()
    {
        return hasOverdraft;
    }

    public void setHasOverdraft (boolean hasOverdraft)
    {
        this.hasOverdraft = hasOverdraft;
    }

    public boolean deposit (double amount)
    {
        if (amount > 0)
        {
            this.balance += amount;
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean withdraw (double amount)
    {
        if (amount > 0 && (this.hasOverdraft || amount <= this.balance))
        {
            this.balance -= amount;
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean addInterest (int interestRate)
    {
        if (interestRate > 0 && this.balance >= 0)
        {
            this.balance += this.balance * (interestRate / 100.0);
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public String toString ()
    {
        final StringBuilder sb = new StringBuilder ("CurrentAccount{");
        sb.append ("accountNumber='").append (accountNumber).append ('\'');
        sb.append (", accountHolder='").append (accountHolder).append ('\'');
        sb.append (", balance=").append (balance);
        sb.append (", hasOverdraft=").append (hasOverdraft);
        sb.append ('}');
        return sb.toString ();
    }

}
