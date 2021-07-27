package AbstractionConcept;

public class TestCar {

	public static void main(String[] args) {
		// Can create object of BMW class not of interface 
     BMW b = new BMW();
     b.start();
     b.stop();
     b.refuel();
     b.theftsafety();
     
     Car c = new BMW(); // this is called polymorphism , child class called by parent 
      c.start();
	}

}
