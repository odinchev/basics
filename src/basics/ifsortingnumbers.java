package basics;
import java.util.Scanner;
public class ifsortingnumbers
{
   public static void main(String[]args)
   {
  int num1;
  int num2;
  int num3;
  int num4;
  Scanner keyboard=new Scanner(System.in);
  System.out.println("enter 4 numbers");
  num1=keyboard.nextInt();
  num2=keyboard.nextInt();
  num3=keyboard.nextInt();
 
     if (num3>num2)
     {
        
        System.out.println(num2);//  num1>num2&&num1>num3&&num2<num3&&num3<num4
        
     }
      if (num3<num1)
     {
        System.out.println(num3);
     }
      if (num1>num2)
      {
         
         System.out.println(num1);//  num1>num2&&num1>num3&&num2<num3&&num3<num4
         
      }
     
   } 
}
