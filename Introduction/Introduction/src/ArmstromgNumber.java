
public class ArmstromgNumber {

	public static void isArmstromgNumber(int num) {
		int cube =0;
		int r;
		int t;
		t=num;
		while(num>0) {
			
			r = num%10; //121 ka reminder  
			num = num/10; //division =
			cube = cube + (r*r*r);
		}
		
		if(t==cube) {
			System.out.println("This is a armstrong number ::");
		}else {
			System.out.println("This is not a armstrong number::");
		}
	}
	
	
	
	
	public static void main(String[] args) {
		isArmstromgNumber(121);
		isArmstromgNumber(153);
		isArmstromgNumber(407);
		isArmstromgNumber(370);
		isArmstromgNumber(371);

	}

}
