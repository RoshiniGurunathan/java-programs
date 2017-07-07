import java.util.Scanner;
public class BigSmall
{
public static void main(String args[])
{
Scanner input = new Scanner(System.in);
 int[] numbers = new int[5];
 for(int i = 0; i < numbers.length; i++)
    {
        System.out.println("Please enter the number"); 
        numbers[i] = input.nextInt();
    }
int big=numbers[0];
int small=numbers[0];
for(int i=1;i<=numbers.length-1;i++)
{
   if(numbers[i]>big)
{   big=numbers[i];
}
   else if(numbers[i]<small)
   {small=numbers[i];}
}
System.out.println("big:" +big);
System.out.println("small:" +small);

}}