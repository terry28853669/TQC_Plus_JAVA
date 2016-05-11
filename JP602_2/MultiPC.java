package JP602_2;

class MultiPC extends PCandMultiPC
{

    MultiPC(int i, int j)
    {
        cpu = new CPU(2.4);
        hd = new HD(160);
        CPUno = i;
        HDno = j;
    }

    double getCost()
    {
        return (double)super.getPartCost() * 1.2;
    }
}