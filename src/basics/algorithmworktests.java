package basics;

public class algorithmworktests
{
 public static void main(String[] args)
 {
    algorithmwork alg=new algorithmwork(10);
    System.out.println(alg);
    
    algorithmwork alg2=new algorithmwork(11);
    System.out.println(alg2);
    if (alg2.equals(alg))
    {
       System.out.println("they are the same");
    }
    else 
    {
       System.out.println("they are not the same");
    }
    if (alg2.greaterthan(alg))
    {
       System.out.println("its greater than");
    }
    else
    {
       System.out.println("its not not greater than");
    }
 }
 
}
