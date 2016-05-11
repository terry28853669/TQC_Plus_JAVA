package JP602_2;

class HD extends Part
{

    HD(int i)
    {
        size = i;
        if(i == 120)
            cost = 2400;
        else
        if(i == 160)
            cost = 2800;
    }

    int size()
    {
        return size;
    }

    int size;
}