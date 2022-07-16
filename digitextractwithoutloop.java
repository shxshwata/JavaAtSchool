class digitextractwithoutloop
{
    public static void main(int a)
    {
        int x1=a/100000%10;
        int x2=a/10000%10;
        int x3=a/1000%10;
        int x4=a/100%10;
        int x5=a/10%10;
        int x6=a/1%10;
        System.out.println(x1+"  "+x2+"  "+x3+"  "+x4+"  "+x5+"  "+x6);
    }
}