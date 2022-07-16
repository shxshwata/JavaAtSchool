import java.util.Scanner;
class CaseConvoFirstLetter
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a sentence (string) in lower case: ");
        String s1=sc.nextLine();
        int l=s1.length();
        System.out.print((char)(s1.charAt(0)-32));
        for (int i=1;i<l;i++)
        {
            if (s1.charAt(i)!=' ')
            {
                System.out.print(s1.charAt(i));
            }
            else if (s1.charAt(i)==' ')
            {
                System.out.print(" ");
                System.out.print((char)(s1.charAt(i+1)-32));
                i++;
            }
            
        }
    }
}