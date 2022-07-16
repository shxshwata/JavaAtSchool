import java.util.Scanner;
public class SmallxLarge
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the length of the array: ");
        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i=0;i<n;i++)
        {
            System.out.println("Enter the number: ");
            a[i]=sc.nextInt();
        }
        int max=a[0],min=a[0],i1=0,i2=0;
        for (int i=0;i<n;i++)
        {
            if (max<a[i])
            {
                max=a[i];
                i1=i;
            } 
        }
        for (int i=0;i<n;i++)
        {
            if (min>a[i])
            {
                min=a[i];
                i2=i;
            }
        }
        int swap=a[i2];
        a[i2]=a[i1];
        a[i1]=swap;
        System.out.println("The modified array is....");
        for (int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}