public class HCFOriginals
{
    public static void main(int a, int b)
    {
        int ds,dd;
        ds=a;
        dd=b;
        int r=dd%ds;
        while (r>0)
        {
            dd=ds;
            ds=r;
            r=dd%ds;
        }
        int hcf=ds;
        System.out.println(hcf);
        
        
    }
}