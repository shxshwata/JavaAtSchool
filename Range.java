import java.util.*;
public class Range
{
    public static void main()
    {
        int n, min,max;
        System.out.println("Enter the length: ");
        Scanner sc=new Scanner (System.in);
        n=sc.nextInt();
        int[] a=new int[n];
        for (int i=0;i<n;i++)
        {
            System.out.println("Enter the element: ");
            a[i]=sc.nextInt();
        }
        min=a[0];
        max=a[0];
        for (int j=1;j<n;j++) 
        {
            if  (min>a[j])
            {
                min=a[j];
            }
            if (max<a[j])
            {
                max=a[j];
            } 
        }
        int range=max-min;
        System.out.println("The range is "+range); 
        System.out.println("The maximum element is "+max+" "+"and the minimum element is "+min);
    }
}