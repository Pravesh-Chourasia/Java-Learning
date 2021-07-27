
public class MissingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int a[] = {2,3,4,5};
      int sum = 0;
      for (int i =0; i<a.length; i ++) {
    	  
    	  sum = sum + a[i]; //14
      }
  System.out.println(sum);
  int sum1 = 0; 
  for (int j = 1; j<=5; j++ ) {
	  sum1 = sum1 + j; //15
  }
  System.out.println(sum1);
  System.out.println("Missing number is ::" + (sum1 - sum));
	}
}
