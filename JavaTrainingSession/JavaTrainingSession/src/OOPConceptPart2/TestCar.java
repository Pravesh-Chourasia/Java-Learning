package OOPConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		// when method with same name and argument is present in both parent as well as in child class is called
		//method overriding  
		//this is called static polymorphism and compile time polymorphism 
  BMW b = new BMW(); 
  b.start(); //Reference will be given to child class 
  b.stop();
  b.refule(); 
  b.theftSafety();
  b.engine();
  System.out.println("*****");
  Car c = new Car();
  c.start();
  c.stop();
  c.refule();
  System.out.println("******"); 
  //Top Casting 
 Car c1 =  new BMW(); //Child class reference can be refer by parent class reference variable is called dynamic polymorphism --run time polymprphism 
  c1.start();
  c1.stop();
  c1.refule();
  //Down Casting 
  BMW b1 = (BMW)new Car(); //ClassCastException 
 
	}

}
