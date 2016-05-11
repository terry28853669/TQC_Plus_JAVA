package JP602_2;

class CPU extends Part
{

    CPU(double d)
    {
        speed = d;
        if(d == 1.66)
            cost = 6000;
        else
        if(d == 2.2)
            cost = 8000;
        else
        if(d == 2.4)
            cost = 11000;
    }

    double speed()
    {
        return speed;
    }

    double speed;
}