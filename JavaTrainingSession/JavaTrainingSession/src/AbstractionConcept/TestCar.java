package AbstractionConcept;

public class TestCar {

	public static void main(String[] args) {
		BMW b= new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftsafety();
		Car c= new BMW(); //Child class object can be refereed by parent class object reference, this is called polymarphism 
       c.start();
       c.stop();
       c.refuel();
       
	}

}
