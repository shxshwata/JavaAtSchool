import java.util.Scanner;
class CaseConvoFirstLetter2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a sentence (string) in lower case: ");
        String s1=sc.nextLine(); 
        int l=s1.length();
        for (int i=0;i<l;i++)
        {
            if(i == 0 || s1.charAt(i-1) == ' ')
            {
                System.out.print((char)(s1.charAt(i)-32));
            }
            else
            {
                System.out.print(s1.charAt(i));
            }            
        }
    }
}