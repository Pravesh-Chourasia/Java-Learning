
public class StringManuplation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String str = "The rain have sarted here aim";
   String str1 = "The rain have sarted here Aim";
   System.out.println(str.length()); // To get the length of the string 
   System.out.println(str.charAt(10)); // To get the character at 10th index 
   System.out.println(str.indexOf('a')); // To get the first occurrence 
   System.out.println(str.indexOf('a', 6));//To get the occurrence of a after 6th index 
   System.out.println(str.indexOf('a', str.indexOf('a')+1));// TO get the second occurrence of a 
   System.out.println(str.indexOf("have")); // To get the index of have string 
   System.out.println(str.indexOf("hello")); // When string is not present indexof function will return -1
   //String Comparison 
   System.out.println(str.equals(str1)); //.equal function is case sensitive 
   System.out.println(str.equalsIgnoreCase(str1)); // .equalsIgnoreCase function is not case sensitive 
   
   //Subtracting String 
   System.out.println(str.substring(3, 14)); // It will print the substring between 3rd and 14th index 
   
   //trim function -  remove before and after spaces 
   String s = " Hello World" ; //Trim function remove before and after space 
   String s1 = " Hello_World_Java" ;
   String date = "02-04-2021";
   System.out.println(s.trim());
   
   //Replace function - To replace oldchar  with newchar
   System.out.println(s1.replace("_","?"));
   System.out.println(date.replace("-", "/"));
   
   //Split function will return array list and split based on the parameter provided 
   
   String s3 = "The_Hello_World_Seleneium";
   String s4 [] = s3.split("_");
   for (int i =0 ; i < s4.length; i++) {
	   System.out.println(s4[i]);
	   //Concatenating .concat functionappend the character/word provided 
	   String c = "cares";
	   System.out.println(c.concat("ss"));
	   ////Addition starts from left to right 
	   String x = "Hello";
	   String y = "World";
	   int a = 100;
	   int b = 200;
	   System.out.println(x+y); // output would be HelloWorld
	   System.out.println(a+b); // output would be 300
	   System.out.println(x+y+a+b);  //output would be HelloWorld100300
	   System.out.println(a+b+x+y);   //output would be 300HelloWorld
	   
	   
   }
	}

}
