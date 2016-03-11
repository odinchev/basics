package basics;

public class Point
{

   private int x;
   private int y;
   
   
   
   public Point(int x,int y)
   {
      this.x=x;
      this.y=y;
   }
   public void setx(int x)
   {
      this.x=x;
   }
   public void sety(int y)
   {
      this.y=y;
   }
   public int getx()
   {
      return x;
   }
   public int gety()
   {
      return y;
   }
   public void moveTo(int newX,int newY)
   {
      this.x=newX;
      this.y=newY;
   }
   public void move(int xDistance,int yDistance)
   {
      x=x+xDistance;
      y=y+yDistance;
   }
   public String toString()
   {
      return x+""+y;
   }
   
}
