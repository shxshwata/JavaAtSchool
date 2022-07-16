class FibonEndV
{
    public static void main(int limit)
    {
        int a=0,b=1;
        int c=0;
        for ( ; ; )
        {            
            c=a+b;
            if(c>=limit)
                break;
            System.out.println(c);
            a=b;
            b=c;
            
        }
    }
}