public class RewardValue {
    public static double MILES_TO_CASH_CONVERSION_RATE=0.0035;
    private double cash;
    private int miles;

    RewardValue(double cDouble)
    {
        cash=cDouble;

    }
    RewardValue( int mInt)
    {
        miles=mInt;
    }
    public  double getMilesValue()
    {
        return cash*MILES_TO_CASH_CONVERSION_RATE;
    }
    public double getCashValue()
    {

               return cash;
    }
}

