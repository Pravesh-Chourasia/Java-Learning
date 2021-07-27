package JavaBasics;

public class FinallyConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       //test1();
		//test2();
		division();
	}
	public static void test1() {
		try {
			System.out.println("inside the try block");
			throw new RuntimeException("test");
			}catch (Exception e) {
				System.out.println("Inside the catch block");
			}
		finally {
			System.out.println("inside the finally block");
		}
		
	}
	public static void test2() {
		try {
			System.out.println("Inside the test2 method try block");
		}
		finally {
			System.out.println("inside the finally block of test2 method");
		}
	}
	public static void division() {
		int i =10 ;
		try{
			System.out.println("Inside the try block");
			int k = i/0;	
		}catch (ArithmeticException e) {
			System.out.println("Inside the cathc block");
			System.out.println("division has been performed");
		}
		finally {
			System.out.println("Inside the finally block");
		}
	}

}
