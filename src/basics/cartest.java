package basics;

public class cartest
{
 public static void main(String[]args)
 {
    car car1=new car("ford","gt ","green","opii","2009");
    System.out.println(car1);
    car car2=car1.copy();
          System.out.println(car2+" car ");
          if (car2.equals(car1))
          {
             System.out.println("the cars are the same");
          }
          else
          {
             System.out.println("the cars are not the same");
          }
 }
}
