package JP602_4;

class PC extends PCandMultiPC
{

    PC()
    {
        cpu = new CPU(2.3999999999999999D);
        hd = new HD(160);
        CPUno = 1;
        HDno = 1;
    }

    double getCost()
    {
        return (double)(super.getPartCost() + 500);
    }
}