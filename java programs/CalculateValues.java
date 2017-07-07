public class CalculateValues implements Calculator
{
public int add(int i,int j,int k)
{
return i+j+k;
}
public int sub(int i,int j,int k)
{
return (i+j)-k;
}
public void display()
{
System.out.println("Addition:" +add(10,20,30));
System.out.println("Subtraction:" +sub(10,30,20));
}
public static void main(String args[])
{
CalculateValues obj=new CalculateValues();
obj.display();
}}
