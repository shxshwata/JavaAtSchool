import java.util.Scanner;
public class ScalarMatrix
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        int s=5;
        int[][] a=new int[s][s];
        int sum=0,i=0,j=0;
        for (i=0;i<s;i++)
        { 
            for (j=0;j<s;j++)
            {
                System.out.println("Enter the element: ");
                a[i][j]=sc.nextInt();
            }
        }
        
        int flag = 0;
        int x = a[0][0];
        for(i = 0; i < s; i++)
        {
            if(a[i][i] != x)
            {
                flag =  1;
                break;
            }
        }
        if(flag == 0)
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}