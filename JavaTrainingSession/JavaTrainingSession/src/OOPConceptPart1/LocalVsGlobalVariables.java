package OOPConceptPart1;

public class LocalVsGlobalVariables {
   //Global Variables -- can we accessed only by creating object of the class  
	String name = "Pravesh";
	int age = 32;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =15; //local variable for main method
		System.out.println(i);
		LocalVsGlobalVariables obj=new LocalVsGlobalVariables();
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		
		
  
	}
	public void sum() {
		int i=17; //local variable for sum method 
		int j=39;
		
		
	}
	

}
