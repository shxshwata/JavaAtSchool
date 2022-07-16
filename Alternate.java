import java.util.Scanner;
class Alternate
{ 
    public static void main()
    {
        int n,s=0;
        System.out.print("Enter the length");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a=new int [n];
        for (int i=0;i<n;i++)
        {
            System.out.println("Enter element: ");
            a[i]=sc.nextInt();
        }             
        for (int i=0;i<n;i=i+2)
        {
            System.out.println(a[i]);
        }
    }
}