
public class JA106 {
	 public static void main(String args[])
	    {
	        System.out.printf("f(-3.2) = %.4f\n", f(-3.2));
	        System.out.printf("f(-2.1) = %.4f\n",f(-2.1));
	        System.out.printf("f(0) = %.4f\n", f(0.0D));
	        System.out.printf("f(2.1) = %.4f\n", f(2.1));
	    }

	    static double f(double d)
	    {
	        return (3 * Math.pow(d, 3) + 2 * d) - 1;
	    }

}
