public class MethodOverloading
{
public int add(int i,int j)
{
System.out.println("Addition of 2 integers:");
return i+j;
}
public int add(int i, int j,int k)
{
System.out.println("Addition of three integers:");
return i+j+k;
}
public int mul(int i, int k)
{
System.out.println("Multi of I and K:");
return i*k;
}
public static void main(String args[])
{

MethodOverloading obj=new MethodOverloading();
System.out.println(obj.add(10,20));
System.out.println(obj.add(10,20,30));
System.out.println(obj.mul(10,20));
}
}

