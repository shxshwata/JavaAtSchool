class MagicalNo
{
    public static void main(int n)
    {int d, sum=0;

     while (true){   
        System.out.println("n="+n);
        sum = 0;
        while (n!=0)
        {
            d=n%10;
            sum=sum+d;   
            n = n / 10;
        }
        System.out.println("sum="+sum);
        if (sum==1)
        {
            System.out.println("It's a Magical Number.");
            break;
        }
        else if(sum > 1 && sum < 10) 
        {
            System.out.println("It's NOT a Magical Number.");        
            break;
        }
        else
        {
            n = sum;
        }
    }
}
}