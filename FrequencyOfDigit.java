public class FrequencyOfDigit
{
    public static void main(int n)
    {
        int count0=0,count1=0,count2=0,count3=0,count4=0,count5=0,count6=0,count7=0,count8=0,count9=0,d,m=0;
        while (n>0)
        {
            d=n%10;
            
            n=n/10;
            if (d==0)
            {
                count0=count0+1;
            }
            else if (d==1)
            {
                count1=count1+1;
            }
            else if (d==2)
            {
                count2=count2+1;
            }
            else if (d==3)
            {
                count3=count3+1;
            }
            else if (d==4)
            {
                count4=count4+1;
            }
            else if (d==5)
            {
                count5=count5+1;
            }
            else if (d==6)
            {
                count6=count6+1;
            }
            else if (d==7)
            {
                count7=count7+1;
            }
            else if (d==8)
            {
                count8=count8+1;
            }
            else if (d==9)
            {
                count9=count9+1;
            }
        }
        System.out.println("0:"+count0);
        System.out.println("1:"+count1);
        System.out.println("2:"+count2);
        System.out.println("3:"+count3);
        System.out.println("4:"+count4);
        System.out.println("5:"+count5);
        System.out.println("6:"+count6);
        System.out.println("7:"+count7);
        System.out.println("8:"+count8);
        System.out.println("9:"+count9);
    }
}