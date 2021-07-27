package AbstractionConcept;

public class TestBank {

	public static void main(String[] args) {
		HdfcBank hb = new HdfcBank(); // By creating object, we can access all the method 
		hb.credit();
		hb.debit();
		hb.loan();
		hb.funds();
		
		Bank b = new HdfcBank();  //By using the dynamic polymorphism also, we can call all the methods 
        b.credit();
        b.debit();
        b.loan();
         
	}

}
