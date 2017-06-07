import java.util.*;
public class Incomemain
{
public static void main(String args[])
{
Income obj=new Income();    //constructor creation default constructor

String n; 
int s;
double d=0.02,t;

Scanner scan=new Scanner(System.in);
System.out.println("Enter your name:");
n=scan.nextLine();
obj.setName(n);		//scanner class creation

System.out.println("Enter your Salary:");
s=scan.nextInt();
obj.setSalary(s);


t=(obj.getSalary()-(obj.getSalary()*d));
System.out.println("your name is:" +n);
 System.out.println("Your Income is:" +t);
}
}

