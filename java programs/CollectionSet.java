
import java.util.*;
public class CollectionSet
{
public static void main(String args[])
{
HashSet hs=new HashSet();
hs.add("roshini");
hs.add("sandhiya");
hs.add("roshini");
System.out.println(hs);

LinkedHashSet lhs=new LinkedHashSet();
lhs.add("harish");
lhs.add("gugan");
lhs.add("adithi");
System.out.println(lhs);


TreeSet ts=new TreeSet();
ts.add("gugau");
ts.add("abi");
ts.add("amsa");
System.out.println(ts);

ArrayList<String> list=new ArrayList<String>();
list.add("roshini");
for(String str:list)
{
System.out.println(str);
}
ArrayList<String> list1=new ArrayList<String>();
list1.add("rose");
for(String str:list1)
{
System.out.println(str);
}



}
}
