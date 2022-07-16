public class AreaToCircumference
{
    public static void main(int a)
    {
         final double PI=3.14;
         double c=a/PI;
         double r=Math.sqrt(c);
         double d=2*PI*r;
         System.out.println("The circumference is "+d);
    }
}