public class LargestSmallestD
{
    public static void main(int n)
    {
        int max=0, min=0,d;
        while (n!=0)
        {
            d=n%10;
            if (d>max)
            {
                max=d;
            }
            else if (d<max)
            {
                min=d;
            }
            n=n/10;
        }
        System.out.println("The largest number is "+max+" and the smallest number is "+min+".");
    }
}