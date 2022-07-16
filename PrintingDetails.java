import java.util.Scanner;
class PrintingDetails
{
    public static void main()
    {
       System.out.println("HELLO");
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter your name.");
       String name=sc.nextLine();
       System.out.println("Enter your address.");
       String address=sc.nextLine();
       System.out.println("Enter your phone number");
       int phno=sc.nextInt();
       System.out.println("Your name is "+name+" Your address is "+address+" Your phone number is "+phno);
    }
} 