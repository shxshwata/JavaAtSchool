
/**
 * All elements are even numbers.
 */

import java.util.Scanner;
public class EvenMatrix
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
                if (a[i][j]%2!=0)
                flag=1;
                break;
            }
            if(flag == 1)	
            {
                break;
            }
        }
        if(flag == 0)
        System.out.println("yes");
        else
        System.out.println("no");
    }
}
