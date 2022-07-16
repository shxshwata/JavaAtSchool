import java.util.Scanner;
public class SumAverage
{
    public static void main()
    {
        int n,s=0; 
        System.out.print("Enter the length: ");
        Scanner sc=new Scanner (System.in);
        n=sc.nextInt();
        int[] a=new int [n];
        for (int i=0;i<n;i++)
        {
            System.out.println("Enter element: ");
            a[i]=sc.nextInt();
            s=s+a[i];
        }
        double avg=(double)s/n;
        System.out.println("Sum is "+s+" and the average is "+avg);
    }
}