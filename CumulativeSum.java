import java.util.Scanner;
public class CumulativeSum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        int s=0;
        for (int i=0;i<n;i++)
        {
            System.out.println("Enter the element: ");
            a[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++)
        {
            s=s+a[i];
        }       
        System.out.println("The sum is "+s);
    }
}