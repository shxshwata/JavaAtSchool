import java.util.Scanner;
public class ExpandRuns
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the even length: ");
        int n=sc.nextInt();
        int[] a=new int [n];
        int s=0;
        int p=0;
        for (int i=0;i<n;i++)
        {
            System.out.println("Enter the element: ");
            a[i]=sc.nextInt();
        }
        for (int i=0;i<n;i=i+2)
        {
            s=s+a[i];
        } 
        int[] output=new int[s];
        for (int i=0;i<n;i=i+2)
        {
            int x=a[i];
            int y=a[i+1];
            for (int j=1;j<=x;j++)
            {
                output[p]=y;
                p++;
            }
        }
        for (int i=0;i<p;i++)
        {
            System.out.print(output[i]);
        }
    }
}