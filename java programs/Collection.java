import java.util.*;
public class Collection
{
public static void main(String arg[])
{
ArrayList list=new ArrayList();
list.add("roshini");
list.add("sandhiya");
list.add("krithi");
list.add("meena");
list.add("poo");
list.add(new Integer(10));
list.add("100");
System.out.println(list);
System.out.println("ArraySize:" +list.size());

list.remove(4);

System.out.println(list);

Object o=list.get(4);
Integer intr=(Integer)o;
System.out.println("Index:"+intr);

for(Object element:list)
{
if(element instanceof String)
{
String str2=(String)element;
System.out.println(str2);
}
else
{
Integer int1=(Integer)element;
System.out.println(int1);
}
}
Iterator itrt=list.iterator();
while(itrt.hasNext())
{
Object element1=itrt.next();
if(element1 instanceof String)
{
if(element1.equals("meena"))
{
itrt.remove();
}
}


}
}}