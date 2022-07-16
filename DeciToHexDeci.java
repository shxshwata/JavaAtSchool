import java.util.Scanner;
public class DeciToHexDeci
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        String s="";
        for (int i=0;i<n;i++)
        {
            System.out.println("Enter the element: ");
            a[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++)
        {
            if (a[i]<=9)
            {
                s=s+a[i];
            }
            else if (a[i]==10)
            {
                s=s+"A";
            }
            else if (a[i]==11)
            {
                s=s+"B";
            }
            else if (a[i]==12)
            {
                s=s+"C";
            }
            else if (a[i]==13)
            {
                s=s+"D";
            }
            else if (a[i]==14)
            {
                s=s+"E";
            }
            else if (a[i]==15)
            {
                s=s+"F";
            }
        }
        System.out.println(s);
    }
}