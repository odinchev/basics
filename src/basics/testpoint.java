package basics;

public class testpoint
{
  public static void main(String[]args)
  {
     Point p1=new Point(3,5);
     Point p2=new Point (1,2);
     System.out.println(p1+""+p2);
     
     Math.sqrt(Math.pow(p2.getx()-p1.getx(),2)+Math.pow(p2.gety()-p1.gety(),2));
  }
}
