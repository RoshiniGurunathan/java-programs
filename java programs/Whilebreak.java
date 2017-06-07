public class Whilebreak {
public static void main(String[] args)
 {
int i=1;
while(i<=10) {
if(i==5) {    				/*at i=5 condition gets fail so it will not return any value
						after the condition fais(if==5) */
continue; 
 }
System.out.println(i);
 i++;
			// prints 1 2 3 4 

 }
}
}