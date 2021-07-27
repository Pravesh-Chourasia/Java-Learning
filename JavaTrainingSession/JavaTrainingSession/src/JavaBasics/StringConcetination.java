package JavaBasics;

public class StringConcetination {

	public static void main(String[] args) {
		// + :: it is a concatenation operator 
		//println is used to print the output in the new line 
		//print is used to console output in the same line 
		
		int a = 100;
		int b = 200;
		double d= 12.98;
		double c=56.28;
		String x= "Hello";
		String y = "World";
		
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+a+y+b+a);
		System.out.println(c+d+a+b);
		System.out.println(c+d+x+y);
		System.out.println(a+b+c+x+y);
		System.out.println(a+b+c+d+x+y);
		System.out.println(x+y+(a+b+c+d));
		System.out.println("Hello Selenium");
		
		System.out.println("Hello");
		System.out.println("Print ln");
		System.out.print("print from same line ");
		System.out.print("Print next ln");

	}

}
