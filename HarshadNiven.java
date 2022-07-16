public class HarshadNiven
{
    public static void main(int n)
    {
        int s=0,d,copy=n;
        while (n!=0)
        {
            d=n%10;
            s=s+d;
            n=n/10;
        }
        if (copy%s==0)
        {
            System.out.println("------Harshad------");
        }
        else 
        {
            System.out.println("------Not Harshad------");
        }
    }
}