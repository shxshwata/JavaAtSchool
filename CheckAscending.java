import java.util.Scanner;
public class CheckAscending
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the length of the array: ");
        int n=sc.nextInt();
        int[] a=new int [n];
        int m=0,c=0;
        for (int i=0;i<n;i++)
        {
            System.out.println("Enter the element: ");
            a[i]=sc.nextInt();
            m=a[0];
        }        
        for (int i=0;i<n;i++) 
        {
            if (a[i]>m)
            {
                c++;
                continue;
            }
            else if (a[i]<m)
            {
                System.out.println("Not in ascending order.");
                break;
            }
            m=a[i];
        }
        if (c==n)
        {
            System.out.println("Yes, the array s in ascending order.");
        }
    }
}