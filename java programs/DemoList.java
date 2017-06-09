import java.util.*;
public class DemoList
{
public static void main(String args[])
{
ArrayList list=new ArrayList();
list.add("ro");
list.add("sandhya");
list.add("anand");
list.add("Guru");
list.add("ravi");
list.add("500");
list.add(new Integer(1000));

list.remove(2);

Object t=list.get(1);
String str=(String)t;
Object o=list.get(5);
Integer intr=(Integer)o;

System.out.println(list);

System.out.println("Size:" +list.size());

System.out.println("indexed String:" +str);

System.out.println("indexed String:" +intr);

for(Object element:list){
if(element instanceof String)
{
String str1=(String)element;
System.out.println("string:" +str1);
}
else
{
Integer intr1=(Integer)element;
System.out.println("Integer:" +intr1);
}
}
}}