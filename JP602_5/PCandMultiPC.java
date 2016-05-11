package JP602_5;

abstract class PCandMultiPC extends AllPC
{

    PCandMultiPC()
    {
    }

    int getPartCost()
    {
        return cpu.getCost() * CPUno + hd.getCost() * HDno;
    }

    abstract double getCost();

    double getPrice()
    {
        return (double)getPartCost() * 1.8D;
    }

    CPU cpu;
    HD hd;
    int CPUno;
    int HDno;
}