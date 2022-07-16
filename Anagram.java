import java.util.Scanner;
public class Anagram
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the first string: ");
        String m=sc.nextLine();
        System.out.println("Enter the second string: ");
        String n=sc.nextLine();
        int h=m.length();
        int g=n.length();
        char ch='A';
        int flag=0, c1=0,c2=0;
        m = m.toUpperCase();
        n = n.toUpperCase();
        for (int i=1;i<=26;i++)
        {
            c1=0;
            c2=0;
            for (int j=0;j<h;j++)
            {
                if (m.charAt(j)==ch)
                {
                    c1++;
                }
            }
            for (int j=0;j<g;j++)
            {
                if (n.charAt(j)==ch)
                {
                    c2++;
                }
            }
            
            if (c1!=c2)
            {
                
                flag++;
                break;
            }
            ch++;
        }
        if (flag==0)
            System.out.println("Yes, it is an anagram.");
        else 
            System.out.println("No, it is not an anagram.");
    }
}