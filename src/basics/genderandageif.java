package basics;
import java.util.Scanner;
public class genderandageif
{
 public static void main(String[]args)
 {
    Scanner keyboard=new Scanner(System.in);
    String gen;
    int age;
    System.out.println("enter gender");
    gen=keyboard.nextLine();
    System.out.println("enter age");
    age=keyboard.nextInt();
    char gender= gen.charAt(0);
    if(!(gender=='m'||gender=='f'&& age>0))
       {
         System.out.println("error in typed values");
         
       
       }
    if (gender=='m' && age<18)
       {
        System.out.println("boy");
       }
    if (gender=='m' && age>=18)
       {
        System.out.println("man");
       }
    if (gender=='f'&& age<18)
        {
          System.out.println("girl");
        }
    if (gender=='f'&& age>=18)
        {
          System.out.println("woman");
        }
    
 }
}
