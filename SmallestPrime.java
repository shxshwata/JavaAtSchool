import java.util.Scanner;
public class SmallestPrime
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the length of the array: ");
        int n=sc.nextInt();
        int[] a=new int[n];
        int f=0,c=0,max=0;
        for (int i=0;i<n;i++)
        {
            System.out.println("Enter the element: ");
            a[i]=sc.nextInt(); 
        }
        for (int i=0;i<n;i++)
        {
            if (a[i]>max)
            {
                max=a[i];
            }
        }
        int min=max;
        for (int i=0;i<n;i++)
        {
            c=0;
            int p=a[i];
            for (int j=1;j<=p;j++)
            {
                 if (p%j==0)
                {
                    c++;
                }
            }
            if (c==2)
            {
                if (p<min)
                { 
                    min=p;
                }
            }
        }
        System.out.println("The smallest prime number is "+min);
    }
}