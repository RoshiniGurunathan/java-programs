public class Charrepeat
{
public static void main(String args[])
{
String g="roshini";
int count=0;
char[] l=g.toCharArray();
System.out.println("repeat:" );
for(int i=0;i<g.length();i++)
{
  for(j=i+1;j<g.length();j++)
   {
     if(l[i]==l[j])
       {
         System.out.println(l[j]);
         count++;
         break;
    }}
}
}
}