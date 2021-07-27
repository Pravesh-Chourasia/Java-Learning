package OOP2;

public interface USBank {

	int min_bal = 100;

	public void debit();

	public void credit();

	public void trafermoney();

	public void trading();
	// no method body, only method declaration
	// method prototype
	// can not create object of interface
	// no static method
	// interface variables are static in nature by default
	//with interface can achieve 100% abstraction 
	//with abstract class can achieve partial abstraction 

}
