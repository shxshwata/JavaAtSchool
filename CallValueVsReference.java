import java.util.Scanner;
import java.util.Arrays;
public class CallValueVsReference
{
    static void callByValue(int a)
    {
        //Call by Value demonstration
        a=5; 
        System.out.println(a);
    }
    static void callByReference2(int[] a)
    {
        //Call by Reference demonstration 
        a[0]=-999;
        System.out.println(Arrays.toString(a));
    }
    public static void main()
    {
        int b=6;
        System.out.println(b);
        callByValue(b);
        System.out.println(b);
        int[] a = new int[3];
        System.out.println(Arrays.toString(a));
        callByReference2(a);
        System.out.println(Arrays.toString(a));
    }
}