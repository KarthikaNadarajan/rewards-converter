public class RewardValue {
    private final double cashValue;
    private final int milesValue;
    public static final double miles_to_cash = 0.0035;
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue/miles_to_cash);
    }

    public RewardValue(int milesValue) {
        this.cashValue = milesValue * miles_to_cash;
        this.milesValue = milesValue;
    }

    public double getCashValue(){
        return this.cashValue;
    }
    public double getMilesValue(){
        return this.milesValue;
    }
}
