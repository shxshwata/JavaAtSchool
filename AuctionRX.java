import java.util.Scanner;
public class AuctionRX 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int l,ch,i,flag=0,rpb=0;
        System.out.println("Enter the number of items: ");
        l=sc.nextInt();
        int[] un=new int[l];
        int[] rp=new int[l];
        int[] nbids=new int[l];
        int[] maxbid=new int[l];
        for (i=0;i<l;i++)
        {
            System.out.println("Enter the unique number: ");
            un[i]=sc.nextInt();
            System.out.println("Enter the reserve price: ");
            rp[i]=sc.nextInt();
            maxbid[i]=0;
        }
        do 
        {   
            System.out.println("Enter the unique number for which you want to bid: ");
            int unb=sc.nextInt();
            for (i=0;i<l;i++)
            {
                if (un[i]==unb)
                {
                    flag++; 
                    System.out.println("Enter the bid: ");
                    rpb=sc.nextInt();
                    if (rpb>maxbid[i]) 
                    {
                        maxbid[i]=rpb;
                        nbids[i]++; 
                        System.out.println("Bid registered");
                    }
                    else 
                    {
                        System.out.println("Bid not registered");
                    }
                }
                else 
                {
                    flag=0; 
                }  
            }
            if (flag==0)
            {
            } 
            System.out.println("Enter 1 to bid again");
            System.out.println("Enter any other key to exit from bidding: ");
            ch=sc.nextInt();
        } while (ch==1);
        for (i=0;i<l;i++)
        {
            if (maxbid[i]>=rp[i])
            {
                System.out.println("SOLD Item "+(i+1));
            }
        }
    }
}