import java.util.Scanner;
public class BinarySearch
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in); 
        int k,s,low,high,mid,i,flag=0;
        System.out.println("Enter the element which needs to be searched: ");
        k=sc.nextInt();
        System.out.println("Enter the length of the array: ");
        s=sc.nextInt(); 
        int[] a=new int [s];
        System.out.println("Enter the elements of the array: ");
        for (i=0;i<s;i++)
        {
            a[i]=sc.nextInt();
        }
        low=0;
        high=s-1;
        while (low<=high)
        {
            mid=(low+high)/2;
            if (k>a[mid])
            {
                low=mid+1;
            }
            else if (k<a[mid])
            {
                high=mid-1;
            } 
            else
            {
                System.out.println("Found "+mid);
                flag=1;
                break;
            } 
        }
        if (flag==0)
        {
            System.out.println("Element is not present");
        }
        
    }
}