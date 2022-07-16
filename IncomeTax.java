import java.util.Scanner;
public class IncomeTax
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the employee: ");
        String name=sc.next();
        System.out.println("Enter the income amount: ");
        double inc=sc.nextDouble();
        double tax=0;
        if (inc<=40000)
        {
            System.out.println("The name of the employee is "+name+" and the income tax amount is "+tax);
        }
        else if (inc<=70000)
        {
            tax=(0.2)*inc;
            System.out.println("The name of the employee is "+name+" and the income tax amount is "+tax);
        }
        else if (inc<=100000)
        {
            tax=(0.3)*inc;
            System.out.println("The name of the employee is "+name+" and the income tax amount is "+tax);
        }
        else if (inc>100000)
        {
            tax=(0.4)*inc;
            System.out.println("The name of the employee is "+name+" and the income tax amount is "+tax);
        }
    }
}