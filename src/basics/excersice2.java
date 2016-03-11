package basics;
import java.util.Scanner;
public class excersice2
{

   public static void main(String[]args)
   {
      String city;
      String upper;
      String lower;
      char letter;
      int strsize;
      
      
      Scanner keyboard=new Scanner (System.in);
      System.out.println("what is you favorite city");
      city=keyboard.nextLine();
      upper=city.toUpperCase();
      lower=city.toLowerCase();
      letter=city.charAt(2);
      strsize=city.length();
      
      System.out.println(city+"\n"+upper+"\n"+lower+"\n" +letter+"\n"+strsize);
      
      
      
      
      
      
      
   }
}
