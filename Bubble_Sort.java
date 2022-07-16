import java.util.Scanner; 
public class Bubble_Sort//Creation of Class Program1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the length of the array: "); 
        int length=sc.nextInt();
        int []a=new int[length]; 
        System.out.println("Enter the elements of the array: ");
        for (int i=0;i<length;i++)
        {
            a[i]=sc.nextInt();
        }
        for (int k=0;k<length-1;k++)
        {
            for (int j=0;j<length-k-1;j++)
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
        for (int l=0;l<length;l++)
        {
            System.out.println(a[l]);
        }
     }
}