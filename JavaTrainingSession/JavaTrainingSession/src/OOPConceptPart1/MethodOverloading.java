package OOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		/*
		 1.Same methods with same name and argument is not allowed (duplicate methods not allowed) 
		 2.Main method can be overloaded 
		 * */
		MethodOverloading obj=new MethodOverloading(); //new MethodOverloading() -- this is a object of a class 
		//& obj is the object reference variable 
		obj.sum();
		obj.sum(12.89);
		obj.sum(32);
		obj.sum(32, 29);
		obj.main(150);
		obj.main(25, 25);
		
	}

	public static void main(int x) {
		System.out.println("this is a  main method overloaded with diffrent argument");
		System.out.println(x);
	}
public static void main(int y, int z) {
		System.out.println("Main method overloaded with diffrent arguments");
		System.out.println(y+z);
	}
	public void sum(){
		System.out.println("Sum Method without Parameter");
	}
	public void sum(int a){
		System.out.println("Sum Method with 1 int Parameter");
		System.out.println("int value is ::" +a);
	}
	public void sum(int a, int b){
		System.out.println("Sum Method with 2 int Parameter");
		System.out.println("Sum of twi intiger values are "+ (a+b));
	}
	public void sum(double a){
		System.out.println("Sum Method with 1 double Parameter");
		System.out.println("double valueis ::" +a);
	}



}
