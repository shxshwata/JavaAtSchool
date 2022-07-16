class digitextract
{
 public static void main(int a)
    {int s=0;
    while (a>0)
    {
        int d=a% 10;
        s=s*10+d;
        a=a/10;
        
        
    } System.out.print(s);
    }
}
 