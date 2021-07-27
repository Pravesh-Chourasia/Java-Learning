package JavaBasics;

public class FunctionsInJava {

	public static void main(String[] args) {	
		//Create the object of class
		FunctionsInJava obj = new FunctionsInJava();
		obj.test();
		int d = obj.sum();
		System.out.println(d);
		String s1 = obj.PQR();
		System.out.println(s1);
		int d1 = obj.div(30, 10);
		System.out.println(d1);
		int d2 = obj.div(500, 10);
		System.out.println(d2);
	    //1. can not create function inside the function 
		//2.functions are independent to each other 
		//3.functions are parallel to each other 
		
	}
	//1. method with no input and no output 
	// void -- does not return any value 
    public void test(){ //0 param 
    	System.out.println("Test Method");
    	
    }
    public void test(int i){ //1 param 
    	System.out.println("Test Method");
    	
    }
    public void test(int i, int j){ //2 param 
    	System.out.println("Test Method");
    	
    }
    //2. no input some output:
    //return type = int
    public int sum(){
    	System.out.println("Sum Method");
    	int a = 10;
    	int b = 20;
    	int c = a+b;
		return c; 
    }	
    public String PQR() {
    	System.out.println("PQR Method");
    	String s = "Selenium";
    	return s;
    }
    //3. some input and output 
    public int div(int x, int y){
    	System.out.println("DIV Method");
    	int z = x/y;
    	return z;
    }
    public String sendMail(int p, String q){
    	System.out.println("send mail method");
    	String h = q+p;
    	return h;
    	
    }
    }
    
    

