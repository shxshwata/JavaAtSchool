import java.util.Scanner;
public class DoubleWord
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the sentence: ");
        String s=sc.nextLine();
        System.out.println("Enter the word to be searched: ");
        String w=sc.next();
        int l=s.length();
        String s1="";
        int c=0;
        for (int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if (ch!=' ')
            {
                s1=s1+ch;
            }
            if (i==l-1 || ch==' ')
            {
                if (s1.equals(w))
                {
                    c++;
                }s1="";
            }
            
        }
        System.out.println(c);
    }
}