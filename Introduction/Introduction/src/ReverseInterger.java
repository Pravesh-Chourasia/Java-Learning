
public class ReverseInterger {

	public static void main(String[] args) {
		// Reverse Integer solution1
		int num = 123456789;
		//int num = 12345;
		int reverse = 0;
		while (num !=0) {
			
		reverse = reverse * 10 + num % 10; //54321
			num = num/10; //1234,123,12,1
			
		}

		System.out.println(reverse);
		long num02 = 12345;
		System.out.println(new StringBuffer(String.valueOf(num02)).reverse());
	}

}
