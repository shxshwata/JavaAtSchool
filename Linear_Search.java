import java.util.Scanner;
public class Linear_Search
{
     public static void main()
     {
         Scanner sc=new Scanner (System.in);
         int s,i,k,flag=0,c=0;
         System.out.println("Enter the element whose index needs to be found: ");
         k=sc.nextInt(); 
         System.out.println("Enter the length of the array: ");
         s=sc.nextInt();
         int[] a=new int[s];
         System.out.println("Enter the elements of the array: ");
         for (i=0;i<s;i++)
         {
             a[i]=sc.nextInt();
         }
         for (i=0;i<s;i++)
         {
             if (a[i]==k)  
             {
                 flag++;
                 System.out.println("The index of the entered element is "+i); 
                 
                }
         }
         if (flag==0)
         {
             System.out.println("The entered element is not present in the array.");
         }
     }  
}   