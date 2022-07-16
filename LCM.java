public class LCM
{
    public static void main(int a, int b)
    {   int g,lcm=0;
        if (a>b)
        {
            g=a;
        }
        else 
        {
            g=b;
            
        }
        while (a!=0)
        {
            if ((g%a==0) && (g%b==0))
            { 
                lcm=g;
                break;
            }
        g=g+1;
    }System.out.println(lcm);
        
}
} 
