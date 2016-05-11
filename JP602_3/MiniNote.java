package JP602_3;

class MiniNote extends Notebook
{

    MiniNote()
    {
        lcd = new LCD(10);
        cpu = new CPU(1.6599999999999999D);
        hd = new HD(120);
    }
}
