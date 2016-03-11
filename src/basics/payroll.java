package basics;

public class payroll
{
private String name;
private double pay;
private double hourpay;





public payroll ()
  {
   name="guy";
   pay=13;
   hourpay=1;   
  }
public payroll(String name,double pay,double hourpay)
 {
   this.name=name;
   this.pay=pay;
   this.hourpay=hourpay;
   
 }

public void setname (String n)
 {
   
   name=n;
   
   
   
 }
public void setpay(double p)
 {
   
   
   
   pay=p;
 }
public void sethourpay(double h)
 {
   
   
   
   
   hourpay=h;
 }
public String name(){
  return name; 
 }
public double pay(){
  return pay; 
  }
public double hourpay(){
  return hourpay; 
  }

public double getgrosspay(){
   
   return hourpay*pay;
   
   
}
public String toString()
 {
   
   
   return name+pay+hourpay;
   
 }
}
