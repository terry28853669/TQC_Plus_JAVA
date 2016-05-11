package JP602_4;

abstract class AllPC
{

    AllPC()
    {
    }

    abstract double getPrice();

    abstract double getCost();

    boolean isExpensive(AllPC allpc)
    {
        return getPrice() > allpc.getPrice();
    }
}