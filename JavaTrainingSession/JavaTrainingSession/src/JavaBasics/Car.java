package JavaBasics;

public class Car {
	String name;
	int price;
	String engine;

	public Car(String name, int price, String engine) {
		this.name = name;
		this.price = price;
		this.engine = engine;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj1 = new Car("BMW", 10, "Automatic"); // this will create one object inside the memory having properties
		// -- name,price and engine
		Car obj2 = new Car("Audi", 20, "Automatic");
		Car obj3 = new Car("Homda", 5, "Manual");
		System.out.println(obj1.name + " " + obj1.price + " " + obj1.engine);

	}

}
