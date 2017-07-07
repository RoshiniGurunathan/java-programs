import java.util.Scanner;
public class PrimeNumbers {

 public static void main(String[] args) {

  int count;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
int a=sc.nextInt();

  for (int i =1 ; i <= a; i++) 
 {
   count = 0;
   for (int j = 2; j <= i / 2; j++) 
    {
    if (i % j == 0)
     {
     count++;
     break;
      }
     }

    if (count == 0) 
    {
    System.out.println(i);
   }
  }
 }
}