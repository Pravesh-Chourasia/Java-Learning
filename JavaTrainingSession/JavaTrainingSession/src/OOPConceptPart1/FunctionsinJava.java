package OOPConceptPart1;

public class FunctionsinJava {
    //main method is starting point of execution 
	public static void main(String[] args) {
		//main method is void -- it never returns value  
		//To access non static method -- need to create object of the class 
		// Creating object of the class and obj is the object reference variable 
		//after creating the object all non static method given to the object reference variable 
		FunctionsinJava obj = new FunctionsinJava();
     obj.test();
     int l = obj.pqr();
     System.out.println(l);
     String s1= obj.qa();
     System.out.println(s1);
     int dv = obj.division(30, 15);
     System.out.println(dv);
	}
	//non static methods
	//void means - does not return anything   
	//return type = void 
	public void test(){//no input no output 
		System.out.println("test method");
	}
	//return type = int
	public int pqr(){//no input some output 
		System.out.println("PQR Method");
		int a = 10;
	    int b = 20;
	    int c = a+b;
	    
	    return c;
	}
	//return type = String
	public String qa(){//no input some output
		System.out.println("qa method");
		String s = "Selenium";
		return s;
		}
	//return type = int
	//x,y are input parameters/arguemtns
	public int division(int x, int y){
		System.out.println("Division Method");
		int d=x/y;
		return d;
	}
	

}
