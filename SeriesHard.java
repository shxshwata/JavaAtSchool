public class SeriesHard
{
    public static void main(int n)
    {
        double s=0;
        for (int i=1;i<=n;i++)
        {
            s=s+(double)(i+i+1)/((i+1)*(i+2));
        }
        System.out.println("The sum of the series is "+s);
    }
}