import java.util.Scanner;
public class MenuDrivenFunc
{
    public void add(int x, int y)
    {
        int sum = x + y; 
        System.out.println("The sum is "+sum);
    }
    
    public void sub(int a, int b)
    {
        int diff=a-b;
        System.out.println("The difference is "+diff); 
    }
    
    public int mul(int a, int b)
    {
        int product=a*b;
        return product;
    }

    public void div(int a, int b)
    {
        if(b == 0)
        {
            System.out.println("Divisor cannot be zero");
            return;
        }
        double quo=a/b;
        System.out.println("The quotient is "+quo);
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        MenuDrivenFunc obj = new MenuDrivenFunc();
        int a=15,b=0;
        
        System.out.println("***************************");
        System.out.println("Enter 1 to add");
        System.out.println("Enter 2 to subtract");
        System.out.println("Enter 3 to multiply");
        System.out.println("Enter 4 to divide");
        System.out.println("***************************");
        System.out.println("Enter the choice: ");
        int ch=sc.nextInt();
        switch (ch)
        {
            case 1:
                obj.add(a,b);
                break;
            case 2:
                obj.sub(a,b);
                break;
            case 3:
                int prod = obj.mul(a,b);
                System.out.println("The product is "+prod);
                break;
            case 4:
                obj.div(a,b);
                break;
            default:
                System.out.println("Invalid input entered!");
            
        }
    }
}