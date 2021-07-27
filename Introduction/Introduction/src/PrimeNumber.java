
public class PrimeNumber {
	
	public static boolean isPrimeNumber(int num) {
			
		//Edge/Corner case
		if (num<=1) {
		return false;
	}
	for (int i =2; i<num; i ++) {
		if (num % i == 0) {
			return false;
		}
	}
	return true;
	}
		public static void getPrimeNumbers(int num) {
			System.out.println("Prime Number upto number "+ num);
			for (int i=2; i<=num; i++) {
				if(isPrimeNumber(i))
					System.out.println(i + " ");
			}
		
	
	}
	public static void main(String[] args) {
		System.out.println("2 is prime number ::" +isPrimeNumber(2));
		System.out.println("3 is prime number ::" +isPrimeNumber(3));
		System.out.println("10 is prime number ::" +isPrimeNumber(10));
		System.out.println("13 is prime number ::" +isPrimeNumber(13));
		System.out.println("17 is prime number ::" +isPrimeNumber(17));
		System.out.println("-2 is prime number ::" +isPrimeNumber(-2));
		System.out.println("-15 is prime number ::" +isPrimeNumber(-15));
        getPrimeNumbers(7);
        getPrimeNumbers(13);
        getPrimeNumbers(20);
        getPrimeNumbers(23);
	}

}
