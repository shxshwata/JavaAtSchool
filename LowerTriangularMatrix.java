/**
 * Lower triangular matrix is such a matrix whose elements above the major diagonal are zeroes and below the major
 diagonal are non-zeroes.
 */


import java.util.Scanner;
public class LowerTriangularMatrix
{
    public static void main(String[] args)
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
        
    }
}
