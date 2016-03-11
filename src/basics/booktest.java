package basics;
import java.util.Scanner;

public class booktest
{
  public static void main(String[]args)
  {
     Scanner keyboard=new Scanner(System.in);
    
     
     
     
     
     
     
     
     
     book book1=new book(keyboard.nextLine(),keyboard.nextLine(),keyboard.nextDouble(),keyboard.nextInt());
     System.out.println(book1);
    keyboard.nextLine(); 
     
    book book2=new book(keyboard.nextLine(),keyboard.nextLine(),keyboard.nextDouble(),keyboard.nextInt());
    System.out.println(book2);
     
     
     
     
     
     
     
     
     
     
  }
}
