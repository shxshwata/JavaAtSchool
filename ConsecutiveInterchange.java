import java.util.Scanner;
public class ConsecutiveInterchange
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter an even length of array: ");
        int n=sc.nextInt();
        int[] a=new int[n];
        int swap;
        for (int i=0;i<n;i++)
        {
            System.out.println("Enter the number: ");
            a[i]=sc.nextInt();
        }
        for (int i=0;i<n;i=i+2)
        {
            swap=a[i+1];
            a[i+1]=a[i];
            a[i]=swap;
        }
        System.out.println("The modified array is....");
        for (int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}