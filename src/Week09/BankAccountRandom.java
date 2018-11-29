package Week09;

import java.util.Random;

public class BankAccountRandom
{
    private String accountNumber;

    public BankAccountRandom ()
    {
        this.accountNumber = generateAccountNumber ();
    }

    private String generateAccountNumber ()
    {
        String acc = "";
        Random rg = new Random ();
        for (int i = 0; i < 9; i ++)
        {
            acc += rg.nextInt (10);
        }
        return acc;
    }

    public String getAccountNumber ()
    {
        return accountNumber;
    }
}