import java.util.Scanner;
public class AirTickets
{
public static void main()
{
    int a,b,c,d,ch;
    Scanner sc=new Scanner(System.in);
    
    System.out.println("-----ROUND TRIP FARES FOR ECONOMY-----");
    System.out.println("1. Delhi To Kolkata");
    System.out.println("2. Delhi To Mumbai");
    System.out.println("3. Delhi To Bengaluru");
    System.out.println("4. Delhi To Chennai");
    System.out.println("--------------------------------------");
    System.out.println("Enter your route number:");
    ch=sc.nextInt();
    switch (ch)
    {
        case 1:
            a=5095;
            System.out.println("The total price is "+a);
            break;
        case 2:
            b=4965;
            System.out.println("The total price is "+b);
            break;
        case 3:
            c=6500;
            System.out.println("The total price is "+c);
            break;
        case 4:
            d=6560;
            System.out.println("The total price is "+d);
            break;
        default:
            System.out.println("Wrong Choice for now but in future the number you entered will be valid.");
            
        
        }
}
} 