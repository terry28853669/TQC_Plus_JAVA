package JP602_2;

class PC extends PCandMultiPC
{

    PC()
    {
        cpu = new CPU(2.4);
        hd = new HD(160);
        CPUno = 1;
        HDno = 1;
    }

    double getCost()
    {
        return (double)(super.getPartCost() + 500);
    }
}