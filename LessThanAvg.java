import java.util.Scanner;
public class LessThanAvg
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the length: ");
        int n=sc.nextInt();
        int[] a=new int[n];
        int s=0;
        for (int i=0;i<n;i++)
        {
            System.out.println("Enter the element: ");
            a[i]=sc.nextInt();
            s=s+a[i];
        }
        double avg=s/n;
        for (int i=0;i<n;i++)
        {
            if (a[i]<avg)
            {
                System.out.println(a[i]);
            }
        }
    }
}