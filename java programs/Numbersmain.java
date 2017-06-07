public class Numbers
{
int ab,cd;
public Numbers(int ab,int cd)
{
int ab=a;
int cd=b;
}

public void add()
{
return 0;
}
}

public class Addition extends Numbers
{
public Addition(int ab,int cd)
{
super(a,b);
}
public void add()
{
return ab+cd;
}
}


public class Numbersmain
{
public static void main(String args[])
{
Addition total=new Addition(10,20);
System.out.println("add:" +total.add);
}
}
