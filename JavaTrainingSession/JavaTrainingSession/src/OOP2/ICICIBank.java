package OOP2;

public class ICICIBank implements USBank, RBI {
    //Coming from RBI interface 
	@Override
	public void educationloan() {
		System.out.println("ICICI-- Education Loan");
		
	}

	@Override
	public void homeloan() {
		System.out.println("ICICI--Home Loan");
		
	}

	@Override
	public void carloan() {
		System.out.println("ICICI--Car Loan");
		
	}
  //Coming from USBank interface 
	@Override
	public void debit() {
		System.out.println("ICICI--Debit");
		
	}

	@Override
	public void credit() {
		System.out.println("ICICI--Credit");
		
	}

	@Override
	public void trafermoney() {
		System.out.println("ICICI--Transfer Money");
		
	}

	@Override
	public void trading() {
		System.out.println("ICICI--Trading");
		
	}
	//ICICI Bank class method 
	public void mutualfunds() {
		System.out.println("ICICI--mutual funds");
	}
	public void insurance() {
		System.out.println("ICICI--insurance");
	}
	

}
