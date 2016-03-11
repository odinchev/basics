package basics;
import java.util.Scanner;
public class ifage
{
   public static void main (String []args)
   {
   Scanner keyboard=new Scanner (System.in);
   
   int age;
    age=keyboard.nextInt();
       if (age<0)
       {
          System.out.println("error in age value");
       }
       if (age>0&& age<=12)
         {
          
          System.out.println("child");
          
         }
       if (age>=13&& age<=19)
       {
          System.out.println("teenager");
       }
       if(age>=20&&age<=65)
       {
          System.out.println("adult");
       }
       if (age>65)
       {
          System.out.println(" senior citizen  ");
       }
   
   
   
   
   
   }
}
