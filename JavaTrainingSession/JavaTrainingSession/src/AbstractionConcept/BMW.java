package AbstractionConcept;

public class BMW implements Car {

	@Override
	public void start() {
		System.out.println("BMW--Start");

	}

	@Override
	public void stop() {
		System.out.println("BMW--stop");

	}

	@Override
	public void refuel() {
		System.out.println("BMW--refuel");
		
	//Non Overridden methods
			
		}
	public void theftsafety() {
		System.out.println("BMW--theftsafety");
	}

	}


