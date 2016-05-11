package JP602_3;

class JPA06_3
{

    public static void main(String args[])
    {
        PC pc = new PC();
        Note15 note15 = new Note15();
        if(pc.isExpensive(note15))
            System.out.println("PC is more expensive than Note15");
        else
            System.out.println("Note15 is more expensive than PC");
    }
}