public class RemovingIntegers
{
    public static void main(int n)
    {
        int d,s=0,m=0;
        while (n>0)
        {
            d=n%10;
            if (d%2==0)
            {
               
            }
            else 
            {
            s=s*10+d;
            }
            n=n/10;
        }
        while (s>0)
        {
            d=s%10;
            m=m*10+d;
            s=s/10;
        }
        System.out.println("The output is "+m);
    }
}