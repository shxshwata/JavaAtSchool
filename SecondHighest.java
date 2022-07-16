import java.util.*;
public class SecondHighest
{
    public static void main()
    {
        int n,max,max2;
        System.out.println("Enter the length: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int [] a=new int [n];
        for (int i=0;i<n;i++)
        {
            System.out.println("Enter the element: ");
            a[i]=sc.nextInt();
        }
        max=a[0];
        max2=a[0];
        for (int j=1;j<n;j++)
        {
            if (max<a[j])
            {
                max2=max;
                max=a[j];
            }
            else if(max2<a[j])
            {
                max2=a[j];
            }
        }
        System.out.println("The second highest element is "+max2);
    }
}