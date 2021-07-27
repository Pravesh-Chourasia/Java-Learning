package JavaBasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList ar = new ArrayList();
        ar.add(100);//0
        ar.add(200);//1
        ar.add(300);//2
        System.out.println(ar.size());
        ar.add(400);
        ar.add(500);
        System.out.println(ar.size());
        ar.remove(4);
        System.out.println(ar.size());
        ar.add("Tom");
        ar.add("Hello");
        ar.add(12.23);
        ar.add('M');//8
        System.out.println(ar.size());
        System.out.println(ar.get(3));
        System.out.println(ar.get(7));
        System.out.println(ar.get(6));
        //System.out.println(ar.get(9));  -- will get IndexOutOfBoundsException
        //to print all the value of array list need to use for loop
        for(int i=0; i<ar.size(); i++) {
        System.out.println(ar.get(i));
        }
        //int array list 
        ArrayList<Integer> ar1 = new ArrayList<Integer>();
        ar1.add(2021);
       // ar1.add("hello"); -- this is integer array and string value can not be store 
        System.out.println(ar1.get(0));
      //string array list 
    	ArrayList<String> ar2 = new ArrayList<String>();
    	ar2.add("Tom");
    	//ar2.add(150); -- can't store integer 
	}
}
