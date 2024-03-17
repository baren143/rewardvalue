public class RewardValue {

    private double cash;
    private double miles;

    RewardValue()
    {
        double cash=0;

    }
    RewardValue( double mile)
    {
        miles=mile;
    }
    public  double getMilesValue()
    {

        return miles*0.0035;

    }
    public double getCashValue()
    {

               return cash;
    }
}

