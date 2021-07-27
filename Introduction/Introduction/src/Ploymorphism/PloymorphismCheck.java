package Ploymorphism;
class Bird {
	public void sing() {
		System.out.println("Bird is singing");
	}
}

class pelican extends Bird{
	public void sing() {
		System.out.println("pelican's Bird is singing");
}	


}



public class PloymorphismCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird b = new pelican();
        b.sing();
	}

}
