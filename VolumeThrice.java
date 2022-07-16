import java.util.Scanner;
public class VolumeThrice
{
    public static void volume(int s)
    {
        int v=s*s*s;
        System.out.println("The volume of the cube is "+v);
    }
    public static void volume(double r)
    {
        double v=4/3.0*Math.PI*r*r*r;
        System.out.println("The volume of the sphere is "+v);
    }
    public static void volume(int l, int b, int h)
    {
        double v=l*b*h;
        System.out.println("The volume of the cuboid is "+v);
    }
    public static void main()
    { 
        Scanner sc=new Scanner (System.in);
        int ch;
        System.out.println("---------------------MENU---------------------");
        System.out.println("Enter 1 to calculate the volume of the cube");
        System.out.println("Enter 2 to calculate the volume of the sphere");
        System.out.println("Enter 3 to calculate the volume of the cuboid");
        System.out.println("----------------------------------------------");
        ch=sc.nextInt();
        while (true)
        {
            if (ch==1)
            {
                System.out.println("Enter side of the cube: ");
                int s = sc.nextInt();
                volume(s);
            }
            else if (ch==2)
            {
                System.out.println("Enter radius of the sphere: ");
                double r=sc.nextInt();
                volume(r);
            }
            else if (ch==3)
            {
                System.out.println("Enter the length of the cuboid: ");
                int l=sc.nextInt();
                System.out.println("Enter the breadth of the cuboid: ");
                int b=sc.nextInt();
                System.out.println("Enter the height of the cuboid: ");
                int h=sc.nextInt();
                volume(l,b,h);
            }
            else 
            {
                System.out.println("Invalid Choice");
            }
            System.out.println("Enter 8 to choose again");
            int ch2=sc.nextInt();
            if (ch2!=8)
            {
                break;
            }
        }
    }
}