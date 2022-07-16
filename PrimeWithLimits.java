public class PrimeWithLimits
{
    public static void main(int a, int b)
    {int count=0;
        for (int i=a;i<=b;i++)
        {
            for (int m=1;m<=i;m++)
            {
                count=count+1;
                if (count==2)
                {
                    System.out.println(i);
                }
            }   
        }
    }
}