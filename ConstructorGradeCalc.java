import java.util.Scanner;
class ConstructorGradeCalc
{
    String name;
    int rollNo; 
    float marks;
    char grade; 
    public ConstructorGradeCalc()
    { 
        name="";
        rollNo=0; 
        marks=0.0f;
        grade='Z';
    }
    public ConstructorGradeCalc(String n, int r, float m)
    {
        name=n;
        rollNo=r;
        marks=m;
        grade='Z';
    }
    public void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Roll number: "+rollNo);
        System.out.println("Marks: "+marks);
        System.out.println("Grade: "+grade);
    }
    public static void main(String[] args)
    { 
        ConstructorGradeCalc s1=new ConstructorGradeCalc();
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the name of the student: ");
        String name=sc.nextLine();
        System.out.println("Enter the roll number of the student: ");
        int rollNo=sc.nextInt();
        System.out.println("Enter the marks of the student: ");
        float marks=sc.nextFloat();
        ConstructorGradeCalc s2=new ConstructorGradeCalc(name, rollNo, marks);
        s1.display();
        s2.display();
    }
}