public class MaxMin
{
    public static void main(double a, double b, double c)
    {
        double d= Math.max(a,b);
        double f=Math.max(d,c);
        double e=Math.min(a,b);
        double g=Math.min(e,c);
        System.out.println("The maximum is "+f);
        System.out.println("The minimum is "+g);
    }
}