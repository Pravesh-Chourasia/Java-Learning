package AbstractionConcept;

public abstract class Bank {
	int amt = 100;
	final int rate = 10;
	static int loanrate = 15;
	
	
	
	//Need to use abstract keyword and in the abstract class there should be one abstract method(only method no body)
	//Achieving partial abstraction, abstraction means hiding the logic
   //abstract class can have abs and no abs methods 
	//can not create the object of abstract class
	
	public abstract void loan(); //abstract method does not have method body it hides the logic 
  public void credit() {
	  System.out.println("Bank---Credit");
  }
  public void debit() { // Non abstract method
	  System.out.println("Bank---Debit");
  }
}
