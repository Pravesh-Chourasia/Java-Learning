
public class Swap_two_String_without_using_temp_third_Variable {

	public static void main(String[] args) {
		// Swap two strings without using temp/third variable
		String a = "Hello";
		String b = "World";
		
		System.out.println("Value of a and b before swapping");
		System.out.println("Value of a is ::" + a);
		System.out.println("Value of b is ::" + b);
		//Make a complete string adding both a and b
		
		a = a+b; //HelloWorld
		
		//Store initial string a in string b
		b = a.substring(0, a.length()-b.length()); // b is Hello now 
		//Store initial string b in string a
		a = a.substring(b.length());
		
		System.out.println("Value of a and b after swapping");
		System.out.println("Value of a is ::" + a);
		System.out.println("Value of b is ::" + b);
		
		
		

	}

}
