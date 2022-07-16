import java.util.Scanner;
public class Taximeter
{
    int taxino,km;
    String name;
    Taximeter()
    {
        taxino=0;
        name="";
        km=0;
    }
    public void input()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the taxi number: ");
        taxino=sc.nextInt(); 
        System.out.println("Enter the name of the passenger: ");
        sc.nextLine();
        name=sc.nextLine();        
        System.out.println("Enter the number of kilometres travelled: ");
        km=sc.nextInt();
        
    }
    public double calculate()
    {   
        double cost=0.0;
        if (km==1)
        {
            cost=5;
        }
        else if (km>1 && km<=6)
        {
            cost=10*km;
        }
        else if (km>6 && km<=12) 
        {
            cost=15*km;
        }
        else if (km>12 && km<=18)
        {
            cost=20*km;
        }
        else if (km>18)
        {
            cost=25*km; 
        }
        return cost; 
    }
    public void display() 
    { 
        double cost=calculate();
        System.out.print(taxino+"\t"+name+"\t"+km+"\t"+cost);
    } 
    public static void main(String[] args)
    {
        Taximeter obj=new Taximeter(); 
        obj.input();
        obj.display();        
    }
}