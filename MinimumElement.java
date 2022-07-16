import java.util.Scanner;
class MinimumElement
{
    public static void main()
    {
        int n, min, pos;
        System.out.println("Enter the length: "); 
        Scanner sc= new Scanner (System.in);
        n=sc.nextInt();
        int []a=new int[n];
        for (int i=0;i<n;i++)
        {
            System.out.println("Enter element: ");
            a[i]=sc.nextInt();
        }
        min = a[0];
        pos = 0;
        for (int j=1;j<n;j++)
        {
            
            if (min>=a[j])
            {
                min=a[j];
                pos = j;
            }
            
        }
        System.out.println("The minimum number is "+min+" at position "+(pos+1));
    } 
}