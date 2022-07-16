public class ZeroesAndOnes
{
    public static void main(int n)
    {
        int k;
        for (int i=1;i<=n;i++) 
        {
            k = i % 2;
            for (int j=1;j<=i;j++)
            {
                System.out.print(k);
                k = (k + 1) % 2;
            }
            System.out.println();
        }
    }
}