package OOPConceptPart1;

public class Car {
	
	//Class vars;
	int mod;
	int wheel;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//right hand side (new Car();- this is a object created for Car Class Car
		//new keyword is used to create the object of a class
		//a,b,c - these are the object reference variable 
		Car a =new Car();
		Car b =new Car();
		Car c= new Car();
		a.mod=2015;
		a.wheel=5;
		b.mod=2019;
		b.wheel=4;
		c.mod=2020;
		c.wheel=6;
		System.out.println("before assigning the refrence");
		System.out.println(a.mod);
		System.out.println(a.wheel);
		System.out.println(b.mod);
		System.out.println(b.wheel);
		System.out.println(c.mod);
		System.out.println(c.wheel);
		System.out.println("after shifting the refrence");
		a=b;
		b=c;
		c=a;
		a.mod=10;
		System.out.println(a.mod);
		c.mod=20;
		System.out.println(a.mod);
		System.out.println(c.mod);
	}

}
