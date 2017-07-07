import java.util.regex.*;
public class StringInt
{
public static void main(String args[])
{
String target="pens are 2 rs so you can get 5 pens for 10 rs.";
Pattern p=Pattern.compile("//d");
Matcher m=p.matcher(target);
while(m.find())
{
System.out.println(m.group());
}
}
}
