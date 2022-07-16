class Armstrong
{
    public static void main(int n) 
    {int d,s=0;
        while (n!=0)
            {
                d=n%10;
                n=n/10;
                s=s+(d*d*d);
            }
        if (s==n)
            {
                System.out.println("Armstrong");
            }
        else 
            {
                System.out.println("WEAK ARM (Not a Armstrong)");
            }
    }
}