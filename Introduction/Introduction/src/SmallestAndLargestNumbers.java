import java.util.Arrays;

public class SmallestAndLargestNumbers {

	public static void main(String[] args) {
		// how to identify largest and smallest numbers from array 
		
		int numbers[] = {2,6,202,100,1500,-4,5,56,-10,78};
		int largest  = numbers[0];
		int smallest = numbers[0];
		
		for(int i =1; i<numbers.length; i ++) {
			if(numbers[i]>largest) {
			largest = numbers[i];
			}
			else if(numbers[i]<smallest) {
				smallest = numbers[i];
			}
	}
		System.out.println("Given array is ::" + Arrays.toString(numbers));
		 System.out.println("largest number is ::" + largest);
		 System.out.println("smallest number is ::" + smallest);
		 
	}

}
