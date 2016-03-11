package basics;

public class workbench5
{
 public static void main(String[]args)
 {
    int sum=0;
    int j=30;
    for (int i=1;i <=30;i++)
    {
       sum=sum + i/j;
       j--;
       System.out.println(i+"/"+j);
    }
    
 }
}
