public class Emp
{
public static void main(String args[])
{
String empname="201700002565S";
String Year=empname.substring(0,4);
System.out.println("yaer:" +Year);

String serialNo=empname.substring(4,8);
System.out.println("serialNo:" +serialNo);

String batchname=empname.substring(12);
System.out.println("batch:" +batchname);

String name="Roshini";
name=name.concat("Gurunathan");
System.out.println(name);


}
}