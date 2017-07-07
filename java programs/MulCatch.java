import java.util.Scanner;
public class MulCatch
{
public static void main(String args[])
{
int arr[]={2,4,6},a=50,b,result;
try
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the b value:");
b=sc.nextInt();
result=a/arr[b];
System.out.println("result:"+result);
}
catch(ArithmeticException ae)
{
System.out.println("ArithmeticException arised");
}
catch(ArrayIndexOutOfBoundsException ae1)
{ 
System.out.println("ArrayIndexOutOfBound");
}
catch(Exception e)
{
System.out.println("Exception");
}
}
}