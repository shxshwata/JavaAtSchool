import java.util.Scanner;
public class Selection_Sort 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        int max,maxPos;
        System.out.println("Enter the length of the array: ");
        int length=sc.nextInt();
        int[] a=new int[length];
        System.out.println("Enter the elements of the array: ");
        for (int i=0;i<length;i++)
        {
            a[i]=sc.nextInt();
        }
        for (int i=0;i<length-1;i++)
        {
            max = a[i];
            maxPos=i;
            for (int j=i+1;j<length;j++)
            {
                if (a[j]>max)
                { 
                    max=a[j];
                    maxPos=j;
                }
            }
            int t=a[i];
            a[i]=a[maxPos];
            a[maxPos]=t;
        }
        System.out.println("The sorted numbers are: ");
        for (int i=0;i<length;i++)
        {
            System.out.println(a[i]);
        }
    }
}