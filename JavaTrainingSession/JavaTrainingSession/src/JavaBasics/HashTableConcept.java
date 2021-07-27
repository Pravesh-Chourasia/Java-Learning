package JavaBasics;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Hashtable h = new Hashtable();
    h.put("A", "Test");
    h.put("B", "Hello");
    h.put("C", "World");
    System.out.println(h.size());
    
    h.put(1, 100);
    h.put(2, 200);
    System.out.println(h.size());
    System.out.println(h.get(1));
    System.out.println(h.get("C"));
    h.put(3, "TOm");
    System.out.println(h.get(3));
    Hashtable<Integer, Integer> h1 = new Hashtable<Integer, Integer>();
    h1.put(01, 010);
   // h1.put("AA", "Sachin"); -- can only store integer value 
    System.out.println(h1.get(01));
    Hashtable<String, String> h2 = new Hashtable<String, String>();
    h2.put("AA", "Sachin");
   // h2.put(01, 100); -- can only store String 
   System.out.println(h2.get("AA"));
	}

}
