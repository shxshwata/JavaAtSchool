public class Ternary
{   
    public static void main(int a, int b, int c)
    {
        System.out.println(((a>b)?(a>c)?a:c:(b>c)?b:c));
    }
}