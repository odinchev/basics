package basics;
import java.util.Scanner;


public class d2excersice4
{
public static void main(String[]args)
  {
   Scanner keyboard = new Scanner (System.in);
   String name;
   int age;
   String adress;
   System.out.println("write your name");
   name=keyboard.nextLine();
   System.out.println("write your age");
   age=keyboard.nextInt();
   keyboard.nextLine();
   System.out.println("write your adress");
   adress=keyboard.nextLine();
   System.out.println(name+"\n"+age+"\n"+adress);
   
   
   
   
   
   
  }
}
