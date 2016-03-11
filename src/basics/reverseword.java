package basics;
import java.util.Scanner;
public class reverseword
{
 public static void main(String[]args)
 {
    Scanner keyboard=new Scanner(System.in);
    String word;
    word=keyboard.nextLine();
    for (int i=word.length()-1; i>=0;i--)
    {
       System.out.print(word.charAt(i)+"");
       
    }
 }
}
