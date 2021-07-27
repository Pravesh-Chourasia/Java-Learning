package OOP2;

public abstract class Shape {
	Shape(){
		System.out.println("Shape Class Constructor");
	}
	
	int color;

	abstract void drawing(); // this is abstract method

	public void fill(){
  System.out.println("Shape -- fill");
	}
	//can not create object of interface/abstract class 

}
