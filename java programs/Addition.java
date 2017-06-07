public class Addition 
{
    int add(int num1,int num2)
	 {
	    return num1+num2;
	 }
   public static void main(String args[])
     {
	Addition obj=new Addition();
	int result=obj.add(10,20);
	System.out.println("Addition of 2 numbers:" +result);
     }
}	