import java.util.Scanner;
public class WordExtractionWithArrays
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String s1=sc.nextLine();
        int length=s1.length();
        int st=0;
        int pos=0, c=0;
        for (int i=0;i<length;i++)
        {
             char ch=s1.charAt(i);
             if (ch==' ')
             {
                 c++;
             }
        }
        int m=c+1;
        String[] words=new String [m];
        for (int i=0;i<length;i++)
        {
            char ch=s1.charAt(i);
            if (ch==' ')
            {
                String w=s1.substring(st,i);
                words[pos]=w;
                pos++;
            }
        }
        String w=s1.substring(st);
        System.out.println(w);
        words[pos]=w;
        pos++;
    }
}