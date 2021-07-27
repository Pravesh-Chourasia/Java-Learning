package OOPConceptPart2;

public class HSBCBank implements USBank, BrazilBank {

	public void credit() {
		System.out.println("hsbc--credit");
	}

	public void debit() {
		System.out.println("hsbc--debit");
		
	}	public void transfermoney() {
		
		System.out.println("hsbc--transfermoney");
		
	}
	public void educationloan() {
		System.out.println("hsbc--edu loan");
	
	}
	public void carloan() {
		System.out.println("hsbc--var loan");
	}
	public void mutualfund() {
		System.out.println("hsbc--mutual fund");
	}

}
