package JP602_4;

class CPU extends Part
{

    CPU(double d)
    {
        speed = d;
        if(d == 1.6599999999999999D)
            cost = 6000;
        else
        if(d == 2.2000000000000002D)
            cost = 8000;
        else
        if(d == 2.3999999999999999D)
            cost = 11000;
    }

    double speed()
    {
        return speed;
    }

    double speed;
}