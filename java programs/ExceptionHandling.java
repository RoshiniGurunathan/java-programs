public class ExceptionHandling
{
public static void main(String args[])
{
int a=10,b=0,result;
try
{
result=a/b;
System.out.println("result:" +result);
}
 catch(ArithmeticException ae)
{
System.out.println("result:" +ae);
}

System.out.println("after Exceptionhandling");
}

}