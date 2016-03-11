package basics;

public class carpets
{
   private double length;
   private double width;
      private double area=length*width;
          
          public carpets(double length,double width)
          {
             this.length=length;
             this.width=width;
          }
          
          public void setlength(double l)
          {
             length=l;
          }
          public void setwidth(double w)
          {
             width=w;
          }
          double getlength()
          {
             return length;
          }
          double getwidth()
          {
             return width;
          }
          double getarea()
          {
             area=length*width;
            return area;
            }
       
          
          public String toString()
          {
             return length+"  "+width;
          }
          
         
}
            

