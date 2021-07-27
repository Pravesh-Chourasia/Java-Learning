
public class FactorialNumber {
	// Find factorial numbers 
			//3=3*2*1
		//1.without recursive 
	public static int factorial(int num) {
		int fact =1;
		if(num == 0) 
			return 1;
			for(int i=1; i<=num;i++) {
				fact= fact*i;//4*3*2*1	
		}
		return fact;
	}
	//with recursive function , function calling itself
	public int fact(int num) {
		if (num==0)
			return 1;
		else 
			return(num* fact(num-1));
		}
	
	
	public static void main(String[] args) {
		System.out.println(factorial(5));
		System.out.println(factorial(3));
		System.out.println(factorial(24));
		System.out.println(factorial(0));
		
	}	

	}


