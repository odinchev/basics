package basics;

public class tractclass
{
   private int area;
  private int length;
  private int width;
     public tractclass(int length,int width)
     {
        this.length=length;
        this.width=width;
        
        
     }
     public int getarea()
     {
        area=length*width;
        return area;
     }
     public String toString()
     {
        return length+"   "+width;
     }
  
}
