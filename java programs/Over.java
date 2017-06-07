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
