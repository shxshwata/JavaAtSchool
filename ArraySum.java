import java.util.Scanner;
public class ArraySum
{
    public static void main()
    {
        int n;
        System.out.println("Enter the length of the array: ");
        Scanner sc=new Scanner (System.in);
        n=sc.nextInt();
        int[] a=new int[n];
        for (int i=0;i<n;i++)
        {
            System.out.println("Enter the element of the array 1: ");
            a[i]=sc.nextInt();
        }
        int[] b=new int[n];
        for (int i=0;i<n;i++)
        {
            System.out.println("Enter the element of the array 2: ");
            b[i]=sc.nextInt();
        }
        int[] c=new int[n]; 
        for (int i=0;i<n;i++)
        {
            c[i]=a[i]+b[i];
            
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(c[i]);
        }
        
    }
}