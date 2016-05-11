package JP602_3;

abstract class AllPC
{

    AllPC()
    {
    }

    abstract double getPrice();

    abstract double getCost();

    boolean isExpensive(AllPC allPC)
    {
        return getPrice() > allPC.getPrice();
    }
}