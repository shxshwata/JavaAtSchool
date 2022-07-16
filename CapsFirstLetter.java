import java.util.Scanner;
public class CapsFirstLetter
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the sentence: ");
        String s=sc.nextLine();
        int l=s.length();
        for (int i=0;i<l;i++)
        {
            if (i==0 || s.charAt(i-1)==' ')
            {
                System.out.print((char)(s.charAt(i)-32));
            }
            else 
            {
                System.out.print(s.charAt(i));
            }
        }
        
    }
}