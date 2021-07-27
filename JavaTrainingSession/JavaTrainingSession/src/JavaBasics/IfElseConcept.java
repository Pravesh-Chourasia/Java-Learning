package JavaBasics;

public class IfElseConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =50;
		int b =20;
		if(b>a) {
			System.out.println("b is greater than a");
		}else {
			System.out.println("a is greater than b");
		}
		int a1 = 67;
		int b1= 67;
		if (a1==b1) {
			System.out.println("a1  is equal to b1");
		}else {
			System.out.println("a1 and b1 are not equal");
		}
		//Write a code to  compare 3 largest number 
		int x= 1000;
		int y=3000;
		int z=6000;
		if (x>y & x>z){
			System.out.println("x is the largest number");
			}
		else if(y>z) {
			System.out.println("y is the largets number");
		}
		else {
			System.out.println("z is the largets number");
		}
		
		}

	}


