package TestMain;

public class TestBase {
	// JVM main(String[] args) -- will look for public static void
	public static void main(String[] args) {
		System.out.println("Main--Method1 ");
		main("Testing");
		main(10);
		main(15, 30);

	}

	public static void main(String args) {
		System.out.println("Main--Method2 ");

	}

	public static void main(int a) {
		System.out.println("Main--Method3 ");
	}

	public static void main(int a, int b) {
		System.out.println("Main--Method4 ");
	}
}
