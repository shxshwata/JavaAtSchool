class DayNumber
{
    public static void main(int a)
    {
        int b=a%7;
        if (b==1)
        {
            System.out.println("Friday");
        }
        else if (b==2){System.out.println("Saturday");}
        else if (b==3){System.out.println("Sunday");}
        else if (b==4){System.out.println("Monday");}
        else if (b==5){System.out.println("Tuesday");}
        else if (b==6){System.out.println("Wednesday");}
        else if (b==0){System.out.println("Thursday");}
        else {System.out.println("Invalid Day Number Entered");}
    }
}