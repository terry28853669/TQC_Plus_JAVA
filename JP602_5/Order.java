package JP602_5;

import java.util.Iterator;
import java.util.LinkedList;

class Order
{

    Order()
    {
        revn = 0.0D;
        pcs = new LinkedList();
    }

    void in(AllPC allpc)
    {
        pcs.add(allpc);
    }

    double revenue()
    {
        double d = 0.0D;
        for(Iterator iterator = pcs.iterator(); iterator.hasNext();)
        {
            AllPC allpc = (AllPC)iterator.next();
            d += allpc.getPrice();
        }

        return d;
    }

    double revn;
    LinkedList pcs;
}