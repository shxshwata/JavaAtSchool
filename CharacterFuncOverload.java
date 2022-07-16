import java.util.Scanner;
public class CharacterFuncOverload
{ 
    public static void check(String str,char ch)
    {
        int length=str.length();
        int count=0;
        for (int i=0;i<length;i++) 
        {
            if (str.charAt(i)==ch)
            { 
                count++;
            }
        }
        System.out.println("The frequency of the desired character is "+ count);
    }
    public static void check(String s1)
    {
        String s2=s1.toLowerCase();
        int length=s2.length();
        for (int i=0;i<length;i++)
        {
            if (s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i'|| s1.charAt(i)=='o' || s1.charAt(i)=='u')
            {
                System.out.print(s1.charAt(i)+" ");
            }
        }
    }
}