import java.util.Scanner;

public class Nf
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
System.out.println("Enter the value to fine the factoril of given number:");
int number=sc.nextInt();
int factorial=number;

for(int i=(number-1);i>1;i--)
{
factorial=factorial*i;
}
System.out.println("factorial:" +factorial);
}
}
