class Automorphic
{
    public static void main(int a, int b)
    {int p,d=0;
        for (int i=a;i<=b;i++)
        {   
            p=i*i; 
            while (p>0)
            {
                d=p%10;
                p=p/10;
                
            }
            if (d==i)
                {
                  System.out.println("Automorphic Number"+d); 
                }
        }
    }
}