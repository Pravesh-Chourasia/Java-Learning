package AbstractionConcept;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HDFCBank hb = new HDFCBank();
        hb.credit();
        hb.debit();
        hb.loan();
        hb.fund();
        Bank b= new HDFCBank();	//Child class object can be refereed by parent class called polymorphism 
        b.loan();
        b.credit();
        b.debit();
	}

}
