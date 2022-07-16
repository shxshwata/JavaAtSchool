import java.util.Scanner;
public class UnitMatrix5X5
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        int s=5;
        int[][] a=new int[s][s];
        int sumMajor=0,sum=0;
        for (int i=0;i<s;i++)
        { 
            for (int j=0;j<s;j++)
            {
                System.out.println("Enter the element: ");
                a[i][j]=sc.nextInt();
            }
        }
        int flag = 0;
        for (int i=0;i<s;i++)
        {            
            for (int j=0;j<s;j++)
            {
                if((i == j && a[i][j] != 1) || (i != j && a[i][j] != 0))
                {
                    flag = 1;
                    break;
                }
            }
            if(flag == 1)
            {
                break;
            }
        }
        if(flag == 0)
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}