package OOPConceptPart1;

public class CallByValueCallByRefrence {
  int p;
  int q;
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallByValueCallByRefrence obj = new CallByValueCallByRefrence();
		int x =100;
		int y =200;
		int addition = obj.testsum(x,y); //call by value and pass by value 
		System.out.println(addition);
		obj.p = 50;
		obj.q = 60;
		obj.swap(obj);
		System.out.println(obj.p);
		System.out.println(obj.q);
	}
	public int testsum(int a, int b) {
		/*a =30;
		b =40;*/
		int c = a+b;
		return c;
	}
 public void swap(CallByValueCallByRefrence t) {
	 int temp;
	 temp = t.p; //50 
	 t.p = t.q; //60
	 t.q = temp; //50	 
 }
}
