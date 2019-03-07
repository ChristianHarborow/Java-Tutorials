package Week16;

public interface GoldAccount {
    double fee = 0;
    double bonus = 0;

    void setBonus();
    void addBonus();
    void setFee(double feeAmount);
    void takeFee();
}
