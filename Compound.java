import java.util.Scanner;
public class Compound
{
    double pamt, rate;
    int time;
    Compound()
    {
        pamt=0.0;
        rate=1.0;
        time=1;
    }
    public void input() 
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the principal amount: ");
        pamt=sc.nextDouble();
        System.out.println("Enter the rate of interest: ");
        rate=sc.nextDouble();
        System.out.println("Enter the time period: ");
        time=sc.nextInt();
    } 
    public double findInterest() 
    {
        double cpdint=(pamt*(Math.pow((1+rate/100),time)))-pamt;
        return cpdint;
    } 
    public void printData() 
    {
        System.out.println("Principal amount: "+pamt);
        System.out.println("Rate %: " +rate); 
        System.out.println("Time period: "+time);
    } 
    public static void main(String[] args) 
    {
        Compound obj=new Compound(); 
        
        obj.input();
        double cpdint = obj.findInterest();  
        obj.printData();
        System.out.println("Compound Interest: "+cpdint);
    }
}