/*  Compile time polymorphism is nothing but the method overloading in java.
 In simple terms we can say that a class can have more than one methods with same name but with different number of arguments or 
different types of arguments or both.
syntax:
======
 class ClassName
access specifier return_type methodName(args)
{
// return value;
}
Access specifier main className
{
//codes
obj creation;
}


Example:
========   */

class DemoUp
{

public void add(int a,double b)
{
double i=a+b;
System.out.println(i);
}

public void add(double a,int b)
{
int i=(int)a+b;
System.out.println(i);
}
}



class Over
{
public static void main(String args[])
{
DemoUp obj=new DemoUp();
obj.add(2,1.1);
obj.add(20.25,20);
}
}
