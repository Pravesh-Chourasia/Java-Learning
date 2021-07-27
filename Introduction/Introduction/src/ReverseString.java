
public class ReverseString {

	public static void main(String[] args) {
		// how to reverse the string 
	String s = "Hello World"; // This is the string 
		int len = s.length(); // To get the length of the string 
		String rev = ""; //Declare blank string variable 
		for (int i = len-1; i>=0; i-- ) {
			rev = rev + s.charAt(i); //to find the character by giving index id 	
		}
		
      System.out.println(rev);
	 StringBuffer sf = new StringBuffer(s); // s is string here (Hello World)
	 System.out.println(sf.reverse());



}
}

//There are 2 ways to reverse the string using for loop and StringBuffer class 
//String class is immutable and not having reverse function
//StringBuffer class is mutable and having reverse function