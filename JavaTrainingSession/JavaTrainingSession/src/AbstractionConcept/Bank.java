package AbstractionConcept;

public abstract class Bank {
	int amt = 100;
	final int rate =10;
    static int loanrate= 5; 
	//Partial abstraction 
	//Hiding implementation logic
	//Abs class can have abs as well as non-abs methods 
	//Can not create the object of abstract class 
	

	public abstract void loan(); // this is a abstract method - no method body

	public void credit() {
		System.out.println("Bank---Credit");
	}

	public void debit() {
		System.out.println("Bank---Debit");
	}

}
