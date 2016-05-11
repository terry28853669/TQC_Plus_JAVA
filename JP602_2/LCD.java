package JP602_2;

class LCD extends Part
{

    LCD(int i)
    {
        inch = i;
        if(i == 10)
            cost = 2000;
        else
        if(i == 15)
            cost = 2500;
        else
        if(i == 17)
            cost = 3000;
    }

    int inch()
    {
        return inch;
    }

    int inch;
}
