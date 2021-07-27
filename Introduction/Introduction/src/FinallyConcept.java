
public class FinallyConcept {

	public static void main(String[] args){
		//test1();
		//test2();
		//test3();
		test4();
	}
		public static void 	test1() {
			
			try{
				System.out.println("We are inside the try block");
				throw new RuntimeException("test");
			}catch (Exception e) {
				System.out.println("We are inside the catch block");
			}
			finally {
				
				System.out.println("We are inside the finally block");
			}
		}
		
		//
			public static void test2(){
				try { 
					System.out.println("We are inside the try block in test2 method");
				}
				finally {
					System.out.println("We are inside the finally block in test2 method");
				}
					
				
		}
			//
			public static void test3(){
				int i = 10;
				try { 
					System.out.println("We are inside the try block in test3 method");
					int k = i/0;
				}catch(ArithmeticException e) {
					System.out.println("We are inside the catch block in test 3 method");
					System.out.println("divided by zero");
				}
				finally {
					System.out.println("We are inside the finally block in test3 method");	
				}
				}
			//
			public static void test4(){
			int i = 10;
			try { 
				System.out.println("We are inside the try block in test4 method");
				int k = i/0;
			}catch(NullPointerException e) {
				System.out.println("We are inside the catch block in test4 method");
				System.out.println("divided by zero");
			}
			finally {
				System.out.println("We are inside the finally block in test4 method");	
			}
			}
			}
	
				
			
		
		
		
		
		
	