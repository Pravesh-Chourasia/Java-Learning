package JavaBasics;

public class LoopsConcept {

	public static void main(String[] args) {
		//1. while loop
		  int i =1;		//Initialization   
          while(i<=5) {   //condition 
    	  System.out.println(i);
    	  i=i+1;	  //increment/decrement 
      }
      System.out.println("***");
		//2. for loop
      int j =1;
      for (j=1;j<=10;j++) { //Initialization, condition, increment
    	  System.out.println(j);
      }
      System.out.println("****");
      int k=10;
      while(k>=1) {
    	  System.out.println(k);
    	  k=k-1;
      }
      System.out.println("****");
      int l =10;
      for(l=10;l>=1;l--) {
    	  System.out.println(l);
      }
	}

}
