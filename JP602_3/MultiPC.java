package JP602_3;

class MultiPC extends PCandMultiPC
{

    MultiPC(int i, int j)
    {
        cpu = new CPU(2.3999999999999999D);
        hd = new HD(160);
        CPUno = i;
        HDno = j;
    }

    double getCost()
    {
        return (double)super.getPartCost() * 1.2D;
    }
}