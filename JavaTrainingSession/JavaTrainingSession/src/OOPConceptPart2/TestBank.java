package OOPConceptPart2;

public class TestBank {

	public static void main(String[] args) { //we are achieving multiple inheritance
		//this is called is a relationship -- it means class to interface relationship 
	System.out.println(USBank.min_bal);
	//USBank.min_bal =200; -- value of variable can not be changed as it is final/static 
	//these methods are from HSBCBank class 
	HSBCBank b1= new HSBCBank(); //static polymorphism , method overriding 
	b1.credit();
	b1.debit();
	b1.transfermoney();
	b1.educationloan();
	b1.carloan();
    //dynamic polymorphism 
	//child class object can be referred by parent interface reference variable 
	//only overridden method can be called 
	//if the class implementing any interface it is mandatory to define/override all methods 
	//This methods are implementing from USBank interface 
	 USBank us= new HSBCBank();
	 us.credit();
	 us.debit();
	 us.transfermoney();
	 //these method we are implementing/overriding from BrazilBank Interface 
	 BrazilBank bn= new HSBCBank();
	 bn.mutualfund();

	}

}
