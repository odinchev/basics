package basics;

public class course
{
   private String name;
   private int numberOfStudents;
   private boolean electiveCourse;
 public course()
 {
    name="bob";
    numberOfStudents=0;
    electiveCourse=false;
 }
 public course(String name,int numberOfStudents,boolean electiveCourse)
 {
    
  this.name=name;
  this.numberOfStudents=numberOfStudents;
  this.electiveCourse=electiveCourse;
 }
 public course(String name,boolean electiveCourse)
 {
  this.name=name;
  numberOfStudents=0;
   this.electiveCourse=electiveCourse;
 }
  
 public void setname(String n)
  {
    name=n;
  }
 public void setnumberOfStudents(int num)
 {
    numberOfStudents=num;
    
 }
 public void setelectiveCourse(boolean e)
 
  {
    electiveCourse=e;
  }
  public String getname()
  {
     return name;
  }
  public int getnumberOfStudents()
  {
     return numberOfStudents;
  }
  public boolean getelectiveCourse()
  {
    return electiveCourse;
  }
  public String toString()
  {
     return name+" " + numberOfStudents+" " + electiveCourse;
  }
 

 {
    
 }
}
