public class StudentClass
{
String name,regno;
public StudentClass(String stdname,String rollno)
{
name=stdname;
regno=rollno;
}
public String toString()
{
return "BioData:   NAME:" +name +"RegNo:" +regno;
}
public static void main(String args[])
{
StudentClass std=new StudentClass("roshini","12345");
System.out.println(std);
}
}
