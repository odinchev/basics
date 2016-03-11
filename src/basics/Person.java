package basics;

public class Person
{


  
    private String name;
    private String birthday;

    
    public Person ()
    {
     name="guy";
     birthday="1.1.1001";
       
       
    }
    public Person (String name, String birthday)
    {
      this.name=name;
      this.birthday=birthday;
       
    }
    
    public void setName(String nam)
    {
      name=nam; 
       
       
       
    }
    public void setBirthday(String birth)
    {
      birthday=birth; 
       
    }
    public String getname()
    {
      return name;
    }
    public String getbirthday()
    {
       
       return birthday;
             
             
    }
  
    public String toString()
    {
       
       return name+birthday;
       
    }
}




