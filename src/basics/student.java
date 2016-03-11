package basics;

public class student
{
 private String Name;
 private char Gender;
 private int StudentNumber=0;
  
  public student(String Name, char Gender)
  {  
     this.Name=Name;
     this.Gender=Gender;
          
  }
  
  public void setName(String N)
  {
     Name=N; 
  }
  public void setStudentNumber (char S)
  {
     StudentNumber=S;
  }
  
  public student (String Name,char Gender,int StudentNumber)
  {
    this.Name=Name;
     this.Gender=Gender;
      this.StudentNumber=StudentNumber;
     
     
     
  }
  
  public void setname (String N)
  {
     Name=N;
  }
  
  public void setgender (char G)
  {
     Gender=G;
  }
  
  public void setStudentNumber (int S)
  {
     StudentNumber=S;
  }
  
  public String getName()
  {
     return Name;
  }
  
  public char getGender()
  {
     return Gender;
  }
  
  public int getStudentNumber()
  {
     return StudentNumber;
  }
  public String toString()
  {
     return Name+Gender+StudentNumber;
  }
  
}
