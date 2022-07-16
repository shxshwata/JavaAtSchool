public class PowerComplex
{
    public static void main(int n,int x)
    {
        double s=0,sign=1,m=1,h;
        for (int i=1,k=1;i<=n;i++,k=k+2)
        {
            m=1;
            for (int j=1;j<=k;j++)
            {
                m=m*x;
            }
            h=sign*m;
            sign=-sign;
            s=s+h; 
        }
        System.out.println("The sum is "+s);
    }
}