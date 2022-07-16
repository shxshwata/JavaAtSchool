import java.util.Scanner;
public class PatternWithMenu
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Please enter your choice(1/2): ");
        int ch=sc.nextInt();
        double s=0;
        switch(ch)
        {
            case 1:
                int x=2;
                int sign=-1;
                for(int i=1;i<=20;i++)
                {
                    s=s+(-sign)*Math.pow(x,i);
                }
                System.out.println(s);
            case 2:
                for (int i=1;i<=5;i++)
                {
                    s=(s*10)+1;
                    System.out.print(s+"   ");
                }
                
        }
    }
}