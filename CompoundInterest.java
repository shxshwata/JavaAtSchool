import java.util.Scanner;
public class CompoundInterest
{
    public static void main()
    {
        Scanner p=new Scanner(System.in);
        System.out.println("Enter the principal amount: ");
        double a=p.nextDouble();
        Scanner r=new Scanner(System.in);
        System.out.println("Enter the rate percentage: ");
        double b=r.nextDouble();
        Scanner t=new Scanner(System.in);
        System.out.println("Enter the time period: ");
        double c=t.nextDouble();
        double x=1+(b/100);
        double y=Math.pow(x,c);
        double m=(a*y)-a;
        System.out.println("The compound interst is "+m);
        
        
        
        
    }
}