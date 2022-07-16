import java.util.Scanner;
public class BubbleSort
{
     public static void main(String[] args)
     {
        Scanner sc=new Scanner (System.in);
        int min,minPos;
        System.out.println("Enter the length of the array: ");
        int length=sc.nextInt();
        int []a=new int[length];
        System.out.println("Enter the elements of the array: ");
        for (int i=0;i<length;i++)
        {
            a[i]=sc.nextInt();
        }
        for (int i=0;i<length-1;i++)
        {
            for (int j=0;j<length-i-1;j++)
            {
                if (a[j]>a[j+1])
                {
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        System.out.println("The sorted elements are: ");
        for (int i=0;i<length;i++)
        {
            System.out.println(a[i]);
        }
     }
}