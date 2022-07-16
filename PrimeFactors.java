import java.util.Scanner;
public class PrimeFactors
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int c=0;
        System.out.println("The prime factors are: ");
        for (int i=1;i<=n;i++)
        {
            if (n%i==0)
            {
                
                for (int j=1;j<=i;j++)
                {
                    if (j%i==0)
                    {
                        c++;
                    }
                }
                if (c==2)
                {
                    System.out.println(i);
                }
                c=0;
            }
        }
    }
}