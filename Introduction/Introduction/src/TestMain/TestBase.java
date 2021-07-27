package TestMain;

public class TestBase {
	
	// JVM will search for main method  public static void main(String[] args
	//To execute other main method, have to define inside main (main(String[] args) as main("Testing")  etc

	public static void main(String[] args) {
		System.out.println("Main Method-1");
		
		main("Testing");
		main(10);
		main(10,20);

	}

	
	public static void main(String args) {
		System.out.println("Main Method-2");

	}
	public static void main(int a) {
		System.out.println("Main Method-3");

	}
	public static void main(int a, int b) {
		System.out.println("Main Method-4");

	}
	
}


