public class Nf
{
public static void main(String args[])
{
int number=3;
int factorial=number;
for(int i=(number-1);i>1;i--)
{
factorial=factorial*i;
}
System.out.println("factorial:" +factorial);
}
}
