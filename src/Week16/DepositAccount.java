package Week16;

public class DepositAccount extends InterestAccount implements GoldAccount{

    public DepositAccount(String accountHolder){
        super(accountHolder);
    }

    @Override
    public void setFee(double feeAmount) {
        if(feeAmount > 0){
            this.fee = feeAmount;
        }
    }
}
