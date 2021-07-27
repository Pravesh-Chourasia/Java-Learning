package JavaBasics;

public class ConstructorConcept01 {
	//Class variable , instance variable 
	String name;
	int age;
  public ConstructorConcept01(){ // 0 parameter
	System.out.println("Default Constructor"); 
  }
  
  public ConstructorConcept01(int i){ // 1 parameter  - this is called constructor overloading 
		System.out.println("Constructor with 1 parameter"); 
		System.out.println(i);
	  }
  public ConstructorConcept01(int i, int j){ // 2 parameter  - this is called constructor overloading 
		System.out.println("Constructor with 2 parameter"); 
		System.out.println(i +" "+j);
	  }
  public ConstructorConcept01(String name, int age){ // 0 parameter
		this.name = name; //this.classvar = localvar
		this.age = age;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorConcept01 obj = new ConstructorConcept01();
		ConstructorConcept01 obj1 = new ConstructorConcept01(10);
		ConstructorConcept01 obj2 = new ConstructorConcept01(10,20);
		ConstructorConcept01 obj3 = new ConstructorConcept01("Tom",25 );
		System.out.println(obj3.name);
		System.out.println(obj3.age);
		
	}

}
