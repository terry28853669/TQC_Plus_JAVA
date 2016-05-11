package JP602_5;

class Note15 extends Notebook
{

    Note15()
    {
        lcd = new LCD(15);
        cpu = new CPU(2.2000000000000002D);
        hd = new HD(160);
    }
}