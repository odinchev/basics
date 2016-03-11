package basics;

public class hello
{

   public static void main(String[] args)
   {
      // TODO Auto-generated method stub
String greeting = args.length > 0 ? args[0] : "world";
System.out.println("hello,"+greeting + "!");
   }

}
