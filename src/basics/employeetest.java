package basics;

public class employeetest
{
public static void main(String[]args1)
 {
  employee employee1=new employee();
  employee1.setname("bobw");
  employee1.setidnumber(14);
  employee1.setdepartment("baking");
   employee1.setposition("bak");
   employee employee2=new employee();
   employee2.setname("bobt");
   employee2.setidnumber(16);
   employee2.setdepartment("cleaning");
   employee2.setposition("cl");
   employee employee3=new employee();
   employee3.setname("bobj");
   employee3.setidnumber(11);
   employee3.setdepartment("buying");
   employee3.setposition("buy");
   System.out.println("name   id number   department    position");
   System.out.println(employee1.getname()+"      "+employee1.getidnumber()+"         "+employee1.getdepartment()+"      "+employee1.getposition());
   System.out.println(employee2.getname()+"      "+employee2.getidnumber()+"         "+employee2.getdepartment()+"      "+employee2.getposition());
   System.out.println(employee3.getname()+"      "+employee3.getidnumber()+"         "+employee3.getdepartment()+"      "+employee3.getposition());
   
   
   
   
   
   
   
   
   
   
   
   
   
 
   
   
   
   
   
   
   
   
   
   
   
 }
}
