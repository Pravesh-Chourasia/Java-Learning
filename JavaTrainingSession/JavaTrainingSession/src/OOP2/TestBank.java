package OOP2;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICICIBank ic = new ICICIBank();
		ic.debit();
		ic.credit();
		ic.trafermoney();
		ic.educationloan();
		ic.carloan();
		ic.homeloan();
		ic.trading();
		ic.mutualfunds();
		ic.insurance();
		System.out.println(USBank.min_bal);
		USBank us = new ICICIBank(); // Created object of ICICIBank class and reference variable of USBank interface
		us.debit();
		us.credit();
		us.trafermoney();
		
	}

}
