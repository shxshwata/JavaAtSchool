import java.util.Scanner;
public class ReversingArraySame
{
    public static void main()
    {
        int n,swap;
        System.out.println("Enter the length: ");
        Scanner sc=new Scanner (System.in);
        n=sc.nextInt();
        int []a=new int[n];
        for (int i=0;i<n;i++)
        {
            System.out.println("Enter the element: ");
            a[i]=sc.nextInt();
        }
        for (int i=0;i<=n/2;i++)
        {
            swap=a[i];
            a[i]=a[n-i-1];
            a[n-i-1]=swap;
        }
        for (int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}