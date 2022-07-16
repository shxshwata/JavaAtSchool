import java.util.Scanner;
public class FrequencyLargestNo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the length: ");
        int n=sc.nextInt();
        int[] a=new int[n];
        int max=0,c=0;
        for (int i=0;i<n;i++)
        {
            System.out.println("Enter the number: ");
            a[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++)
        {
            if (a[i]>max)
            {
                max=a[i];
            }
        } 
        for (int i=0;i<n;i++)
        {
            if (a[i]==max)
            {
                c++;
            }
        }
        System.out.println("The frequency of the largest number "+max+" is "+c);
    }
}