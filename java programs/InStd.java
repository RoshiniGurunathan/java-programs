import java.util.Scanner;
public class Instd
{
int stdid;
String stdname;
char a;

public void getdata()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the student id:");
stdid=sc.nextInt();

System.out.println("Enter the student name:");
stdname=sc.next();

System.out.println("Enter the option for gender:");
a=sc.next().charAt(0);

if(a==1)
{
System.out.println("MALE");
else
System.out.println("FEMALE");
}
}
public static void main(String args[])
{
Instd obj=new Instd();
obj.getdata();
}
}
