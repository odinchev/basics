package basics;
import java.util.Scanner;

public class d2excersice6
{
public static void main(String[]args) 
   {
  Scanner keyboard=new Scanner(System.in);
   String name;
   double age;
   String city;
   String college;
   String profession;
   String animal;
   String petname;
   name=keyboard.nextLine();
   age=keyboard.nextInt();
   city=keyboard.nextLine();
   college=keyboard.nextLine();
   profession=keyboard.nextLine();
   animal=keyboard.nextLine();
   petname=keyboard.nextLine();
   System.out.println("there once was a person named"+name+"who lived in"+city+"at the age of"+age+name+"went to college at"+college+name+"name graduated and went to work as a"+profession+"then"+name+"adopted an"+animal+"lnamed"+petname+"they both lived happly ever after");
   
   
   
     }
}
