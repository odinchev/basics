package basics;

public class challange5
{
public static void main(String[]args)
{

String product1beforetaxes="product1beforetax";

String product2beforetaxes="product2beforetax";

String product3beforetaxes="product3beforetax";

float product1aftertax=80.0f;

float product2aftertax=140.0f;

float product3aftertax=230.0f;

float productonebeforetax =(float)(80.0f+ 80.0f*(25.0/100.0));

float producttwobeforetax= (float)(140.0f+140.0f*(25.0/100.0));

float productthreebeforetax=(float)(230.0f+140.0f*(25.0/100));

String beforetax=("beforetax");

String aftertax=("aftertax");

System.out.println(aftertax +product1aftertax+ product2aftertax +product3aftertax);

System.out.println(beforetax+product1beforetaxes+productonebeforetax+product2beforetaxes+producttwobeforetax+product3beforetaxes+productthreebeforetax);


   
   
   
   
   
   
}
}
