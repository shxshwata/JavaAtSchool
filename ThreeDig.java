import java.util.Scanner;
public class ThreeDig
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the length of the array: ");
        int n=sc.nextInt();
        int[] a=new int [n];
        for (int i=0;i<n;i++)
        {
            System.out.println("Enter the number: ");
            a[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++)
        {
            if (a[i]>=100 && a[i]<=999)
            {
                System.out.println(a[i]);
            }
        }
    }
}