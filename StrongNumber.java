public class StrongNumber
{
    public static void main(int n)
    {
        int s=0,d,m=n,f=1;
        while (n!=0)
        {
            f=1;
            d=n%10;
            for (int i=1;i<=d;i++)
            {
                f=f*i;
            }
            s=s+f;
            n=n/10;
        }
        if (s==m)
        {
            System.out.println("Strong Number");
        }
        else
        {
            System.out.println("Not a Strong Number");
        }
    }
}