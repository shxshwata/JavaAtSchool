import java.util.Scanner;
public class SearchElementFrequency
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        int s,i,k,flag=0;
        System.out.println("Enter the element whose index needs to be found: ");
        k=sc.nextInt();
        System.out.println("Enter the length of the array: ");
        s=sc.nextInt();
        int[] a=new int[s];
        System.out.println("Enter the elements of the array: ");
        for (i=0;i<s;i++)
        {
            a[i]=sc.nextInt();
        }
        for (i=0;i<s;i++)
        {
            if (k==a[i])
            {
                flag=flag+1;
            }
        }
        System.out.println("The frequency of the search element is "+flag);
    }  
} 