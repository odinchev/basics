package basics;

public class coursetest
{
 public static void main(String[]args)
 {
    course c1=new course("jake",1,false);
    course c2=new course("marie",2,true);
    course c3=new course("barry",3,false);
    c1.setname("luke");
    c1.setnumberOfStudents(5);
    c2.setelectiveCourse(false);
   System.out.println(c1+""+c2+c3);
    
 }
}
