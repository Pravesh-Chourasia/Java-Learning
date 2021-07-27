package OOPConceptPart1;

public class StaticAndNonstaticConcept {
	String name= "Navya";  //non static variable -- can be called by creating class object 
	static int age= 8;  //static variable -- can be called directly or by class name

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(age);
      System.out.println(StaticAndNonstaticConcept.age);
		sum();
		StaticAndNonstaticConcept.sum();
		System.out.println(age);
		StaticAndNonstaticConcept obj = new StaticAndNonstaticConcept();
		System.out.println(obj.name);
		obj.sendmail();
		System.out.println(obj.age); //Warning -- static method/variable can be called by class object but not recommended  
	}
	
	public void sendmail(){
		System.out.println("this is a non static methodc-- can be called by creating class object");
	}
  public static void sum() {
	  System.out.println("this is a static method can be called directly or by class name");
  }
}

