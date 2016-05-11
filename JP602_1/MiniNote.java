package JP602_1;

class MiniNote extends Notebook
{

    MiniNote()
    {
        lcd = new LCD(10);
        cpu = new CPU(1.66);
        hd = new HD(120);
    }
}
