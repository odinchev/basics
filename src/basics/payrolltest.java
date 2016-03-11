package basics;
import java.util.Scanner;

public class payrolltest
{
public static void main(String[]args)
 {
   String n;
   double p;
   double h;
  double grosspay;
   Scanner keyboard=new Scanner (System.in);
   
   
   n = keyboard.nextLine();
   p = keyboard.nextDouble();
   h = keyboard.nextDouble();
   
   
   
   payroll roll =  new payroll(n, p, h);
 
   System.out.println("the sum is "+roll.getgrosspay());
   
   System.out.println(roll);
   
   
   
 }
}

