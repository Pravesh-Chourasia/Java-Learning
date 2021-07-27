package JavaBasics;

public class FinallizeConcept {

	public void finalize(){
		System.out.println("finallize method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinallizeConcept f1 = new FinallizeConcept();
		FinallizeConcept f2 = new FinallizeConcept();
		//both the below objects are blank and no body is refrying the object the garbage collector will remove this
		f1 = null;
		f2 = null;
		System.gc();

	}

}
