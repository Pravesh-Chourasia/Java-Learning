import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		// find out duplicate elements from array 
		
		String names[] = {"Java", "Ruby", "Python", "C", "C#", "Java"};
		
		for (int i =0 ; i<names.length; i++ ) {
			for (int j =i+1; j<names.length; j++) {
			
			if (names[i].equals(names[j])) {
				System.out.println("duplicate element is ::" + names[i]);
				
				
		 }
		}
	}
		//Using Hashset , stores unique value 
		
		System.out.println("*************");
		
		Set<String> store = new HashSet<String>();
		for (String name : names) {
			
			if(store.add(name) == false) {
				
				System.out.println("this is duplicate element " + name);
			}
		
		
	}
}
}


