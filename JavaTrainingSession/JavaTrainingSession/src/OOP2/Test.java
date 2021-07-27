package OOP2;

public class Test extends Shape{
	Test(){
		System.out.println("TestClass constructor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //Shape s = new Test();
       //s.drawing();
       //s.fill();
		Test test=new Test();

	}

	@Override
	void drawing() {
		System.out.println("drawing");
		
	}

}
