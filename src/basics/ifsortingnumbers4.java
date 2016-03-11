package basics;
import java.util.Scanner;
public class ifsortingnumbers4
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
  num4=keyboard.nextInt();
     if (num1>num2)
     {
        
        System.out.println(num1);//  num1>num2&&num1>num3&&num2<num3&&num3<num4
        
     }
      if (num2>num3)
     {
        System.out.println(num2);
     }
      if (num3>num4)
      {
         
         System.out.println(num3);//  num1>num2&&num1>num3&&num2<num3&&num3<num4
         
      }
      if (num4<num3)
      {
         System.out.println(num4);
      }
     
   } 
}
