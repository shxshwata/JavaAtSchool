class StringPalindrome
{
    public static void main(String input)
    {
        boolean flag=true;
        int h=input.length();
        for (int i=0;i<input.length();i++) 
        {
            if (input.charAt(i)!=input.charAt(h-i-1))
            {
                flag=false;
                break;
            }
        }
        if (flag==false)
        {
            System.out.println("Not a palindrome string.");
        }
        else 
        {
            System.out.println("It is a palindrome string.");
        }
    }
}