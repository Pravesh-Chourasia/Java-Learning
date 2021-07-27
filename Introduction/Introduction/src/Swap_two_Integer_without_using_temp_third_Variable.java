
public class Swap_two_Integer_without_using_temp_third_Variable {

	public static void main(String[] args) {
		// Swap two integer using third variable
		int x = 150;
		int y = 500;
		int t;
//		t = x; // 5
//		x = y;//10
//		y = t; //5
//		
		//Swap two integer using + operator 
		
//		x = x+y;// 15
//		y = x-y; // 5
//		x = x-y;//10
		
		//Swap two integers using * operator 
		
//		x = x*y; //50
//		y = x/y; //5
//		x = x/y; //5
		
		//Swap two integers using XOR^ operator 
		x  = x^y; //15
		y = x^y; //10
		x = x^y; //5
		System.out.println("Value of X is ::" +x);
		System.out.println("Value of X is ::" +y);
		

	}

}
