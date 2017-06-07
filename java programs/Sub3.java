public class MarkScore
{
int s1,s2;
public void sub1andsub2();
{
System.out.println("Enter the mark in sub1:");
int s1=Integer.parseInt(ar[0]);

System.out.println("Enter the mark in sub2:");
int s2=Integer.parseInt(ar[1]);

}
}

class Sub3 extends MarkScore
{
int s3,total;
public void subthree();
{
System.out.println("Enter the sub3 mark:");
int s3=Integer.parseInt(ar[2]);
total=s1+s2;
System.out.println("Total=" +total);
}

public static void main(String args[])
{
Sub3 m=new Sub3();
m.sub1andsub2();
m.subthree();

}