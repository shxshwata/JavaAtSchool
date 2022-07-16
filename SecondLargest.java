import java.util.Scanner;
public class SecondLargest
{
    public static void main()
    {
        int x,max=0,max2=0;
        for (int i=1;i<=10;i++)
        {
            Scanner sc=new Scanner (System.in);
            System.out.println("Enter the number: ");
            x=sc.nextInt();
            if (x>max)
            {
                max2=max;
                max=x;                
            }           
            else if (x<max && x>max2)
            {
                max2=x;
            }
        }
        System.out.println(max);
        System.out.println("Second Largest Number: "+max2);
    }
}