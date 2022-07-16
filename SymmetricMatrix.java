import java.util.Scanner;
public class SymmetricMatrix
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner (System.in);
        int s=5,flag=0;
        int[][] a=new int[s][s];
        for (int i=0;i<s;i++)
        { 
            for (int j=0;j<s;j++) 
            {
                System.out.println("Enter the element: ");
                a[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<s;i++)
        {
            for (int j=0;j<s;j++)
            {
                if ((a[i][j])==a[j][i])
                {
                    flag=flag+0;
                }
                else 
                {
                    flag++;//lcv increased
                }//2D Array program...matrices.
            }
        }
        if (flag==0)
        {
            System.out.println("Yes, it is a symmetrical matrix.");
        }
        else 
        {
            System.out.println("No, it is not a symmetrical matrix.");
        }
    }
}