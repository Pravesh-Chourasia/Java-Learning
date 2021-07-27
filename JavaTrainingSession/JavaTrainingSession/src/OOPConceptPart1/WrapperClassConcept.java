package OOPConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String x="100";
   System.out.println(x+20);
   
   //data conversion from String to Integer  
  int i =Integer.parseInt(x);
  System.out.println(i);
  System.out.println(i+20);
   //Integer, double, , boolean , String 
  
  //data conversion from String to Double 
  String d = "23.22";
 double d1= Double.parseDouble(d);
 System.out.println(d1);
 
 //data conversion from String to boolean 
 String b="true";
   boolean b1=Boolean.parseBoolean(b);
   System.out.println(b1);
   //data conversion from Integer to String 
   int j = 100;
   System.out.println(j+20);
   String s= String.valueOf(j);
   System.out.println(s);
   System.out.println(s+20);
	}

}
