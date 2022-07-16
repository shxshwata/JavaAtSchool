//Demonstrate method overloading
public class OverloadDemo
{
    void test()
    { 
        System.out.println("No parameters");
    }
    //Overload for one interger parameter
    void test (int a)
    {
        System.out.println("a:" +a);
    }
    //Overload for two interger parameters
    void test (int a , int b)
    {
        System.out.println("a and b: "+a+" "+b);
    }
    //Overload for one double parameter
    double test (double a)
    {
        System.out.println("double a: "+a);
        return a*a;
    }
    static void call()
    {
        OverloadDemo obj=new OverloadDemo();
        double result;
        obj.test ();
        obj.test (5);
        obj.test (7,9);
        result=obj.test(12.73);
        System.out.println("Result of obj.test(12.73): "+result);
    }
}