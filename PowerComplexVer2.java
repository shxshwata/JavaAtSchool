public class PowerComplexVer2
{
    public static void main(int n,int x)
    {
        double s=x,sign=-1,m=1,h=x;
        for (int i=1;i<=n-1;i++)
        { 
            h=h*(x*x);
            s=s+sign*h; 
            sign=-sign;
        }
        System.out.println("The sum is "+s);
    }
}