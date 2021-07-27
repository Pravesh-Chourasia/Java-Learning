package JavaBasics;

public class B extends A {

	public B(){
		super();
		System.out.println("Child Class Constructor");
	}
	public B(int i){
		super(i);
		//System.out.println("Child Class Constructor");
	}
	public B(int a, int b){
		super(a,b);
		//System.out.println("Child Class Constructor");
	}
	public static void main(String args[]) {
		B obj = new B();
		B obj1 = new B(35);
		B obj2 = new B(10,20);
	}
	
}
