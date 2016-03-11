package basics;

public class algorithmwork
{
   private double radius;
   public algorithmwork()
   {
      radius=0;
   }
   public algorithmwork(double radius)
   {
      this.radius=radius;
   }
 
 private double getarea()
 {
    return 3.14*radius*radius;
 }
 private double getradius()
 {
    return radius;
 }
 public String toString()
 {
    return radius+""+getarea();
 }
 
 public boolean equals(algorithmwork te)
 {
    if (radius==te.radius&&getarea()==te.getarea())
    {
       return true;
    }
    
   
    
    else 
    {
       
       return false;
    }
 }
    public boolean greaterthan(algorithmwork alg)
  
    {
     if (getarea()>alg.getarea())  
     {
        return true;
        
     }
     else 
        {
        
        return false;
        }
        }
    }
 

