import java.util.*;
public class MapHash
{
public static void main(String args[])
{
HashMap<String,String> hs=new HashMap<String,String>();
hs.put("12","GURU");
hs.put("15","hamsa");
Set<String> allKeys=hs.keySet();

for(String key:allKeys)
{
System.out.println("keys:" +key  +"value:"  +hs.get(key));
}

String studid="s12000";
String centre_code=studid.substring(1,3).trim();
System.out.println("ID:" +studid);
System.out.println("center:" +centre_code);
}
}