package JP602_3;

abstract class Notebook extends AllPC
{

    Notebook()
    {
    }

    double getCost()
    {
        return (double)(lcd.getCost() + cpu.getCost() + hd.getCost()) * 1.3999999999999999D;
    }

    double getPrice()
    {
        return (lcd.getCost() + cpu.getCost() + hd.getCost()) * 2;
    }

    LCD lcd;
    CPU cpu;
    HD hd;
}