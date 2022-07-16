import java.util.Scanner;
public class CompoundInterest
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the principal amount: ");
        double p=sc.nextDouble();
        
        System.out.println("Enter the rate of interest: ");
        double r=sc.nextDouble();
        
        System.out.println("Enter the time period: ");
        double t=sc.nextDouble();
        
        double d=Math.pow(1+(r/100),t);
        double amt=p*d;
        double ci=amt-p;
        System.out.println("The amount is "+amt+".");
        System.out.println("The coumpound interest is "+ci+".");
    }
}