import java.util.Scanner;
public class TelephoneBill
{
    long phno;
    String name;
    int hire,n;
    float bill;
    TelephoneBill(long phnol,String namel, int nl)
    {
        phno=phnol;
        name=namel;
        n=nl;
        hire =200;
    }
    public void calc()
    {
        bill=hire;
        if (n<=100)
        {
            bill=bill+(float)(n*1);
        }
        else if (n>100 && n<=200)
        {
            bill=bill+100+(float)(n*1.5);
        }
        else if (n>200)
        {
            bill=bill+100+150+(float)(n*2);
        }        
    }
    public void display()
    {
        System.out.println("The bill amount is "+bill);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in); 
        System.out.println("Enter the telephone number: ");
        long phnol=sc.nextLong();
        System.out.println("Name of subscriber: ");
        String namel=sc.nextLine();
        sc.nextLine();
        System.out.println("Number of units: ");
        int nl=sc.nextInt();
        TelephoneBill obj=new TelephoneBill(phnol, namel, nl);
        obj.calc();
        obj.display();
    }
}