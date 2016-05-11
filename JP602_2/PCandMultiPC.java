package JP602_2;

abstract class PCandMultiPC
{
    int getPartCost()
    {
        return cpu.getCost() * CPUno + hd.getCost() * HDno;
    }

    abstract double getCost();

    double getPrice()
    {
        return (double)getPartCost() * 1.8;
    }

    CPU cpu;
    HD hd;
    int CPUno;
    int HDno;
}