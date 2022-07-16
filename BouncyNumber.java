import java.util.Scanner;
public class BouncyNumber
{
    static boolean isBouncy(int x)
    {
        int d,l=0;
        while(x>0)
        {
            d=x%10;
        }
        return true;
    }
    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        if (isBouncy(n)==true)
        {
            System.out.println("It is a increasing number.");
        }
        else
        {
            System.out.println("It is not a bouncy number.");
        }
    }
}