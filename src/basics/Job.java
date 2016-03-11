package basics;

public class Job{
private double salary;
private String jobtitle;
private Person person;

   private String name;
 public Job(double salary,String jobtitle,Person person)
 {
    this.salary=salary;
    this.jobtitle=jobtitle;
    this.person=person;
    

 }
  public Job(double salary,String jobtitle)
  {
     person= null;
     
     
  }
  public void setsalary(double s)
  {
     salary=s;
  }
  public void setjobtitle (String j)
  {
     jobtitle=j;
  }
  public void setperson (Person p )
  {
     person=p;
  }
   
  public double getsalary()
  {
     return salary;
  }
  public String getjobtitle()
  {
     return jobtitle;
  }
  public Person getperson()
  {
     return person;
  }

   public  void givePercentageRaise(double salary)
     {
      double percentgeraise=0.2;
            salary=(salary*percentgeraise);
     }
     
  public String toString ()
  {
     return jobtitle +" "+ salary +" "+ person;
  }
}
