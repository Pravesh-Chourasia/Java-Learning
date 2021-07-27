
public class PalindromeNumber {

	public static void isPalidromeNumebr(int num) {
		System.out.println("Given number is "+ num);
		int r =0;
		int sum =0;
		int t;
		t = num;
		while(num>0) {
			r = num%10; // Will get the reminder here  //1,2,1
			sum = (sum*10)+r; //will get the sum value here //1,12
			num = num/10; //we are reducing the number every time//12
			}
		if (t == sum) {
			System.out.println("palidrome number");
		}else 
			System.out.println("not palidrome number");
	}
	
	
	
	
	public static void main(String[] args) {
		isPalidromeNumebr(121);
		isPalidromeNumebr(343);
		isPalidromeNumebr(1988);


	}

}
