public class MarkScore
{
String s1,s2;
public void Show()
{
System.out.println("Enter the mark in sub1:" +s1);


System.out.println("Enter the mark in sub2:"+s2);


}
}

class Sub3 extends MarkScore
{
String s3;
public Sub3()
{
s1="100";
s2="90";
s3="80";
}
public void Display()
{
System.out.println("Enter the sub3 mark:" +s3);
}
}

public static void main(String args[])
{
Sub3 m=new Sub3();
m.Show();
m.Display();

}
}