package basics;
import java.util.Scanner;
public class password
{
  public static void main(String []args)
  {
     Scanner keyboard=new Scanner(System.in);
     String username;
     int password;
     int password2;
     System.out.println("enter username");
     username=keyboard.nextLine();
     System.out.println("enter password");
     password=keyboard.nextInt();
     System.out.println("enter condirmation ");
     password2=keyboard.nextInt();
     
     if((password2!=password))
     {
        do {
        System.out.println("enter  password again");
        password=keyboard.nextInt();
        password2=keyboard.nextInt();
     }
        while(password2!=password);
     }
     
     
    System.out.println(username+" "+password);
     
     }
}
