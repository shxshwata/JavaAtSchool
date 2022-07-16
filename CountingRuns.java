import java.util.Scanner;
public class CountingRuns
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the length of the array: ");
        int n=sc.nextInt();
        int a[]=new int [n];
        int c=1;
        for (int i=0;i<n;i++)
        { 
            System.out.println("Enter the element: ");
            a[i]=sc.nextInt();
        }
        int m=a[0];
        for (int i=0;i<n;i++)
        {
            if (a[i]!=m)
            {
                c++;
            }
            m=a[i];
        }
        System.out.println("The total number of runs are "+c);
    }
}