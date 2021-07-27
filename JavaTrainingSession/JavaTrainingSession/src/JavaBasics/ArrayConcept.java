package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		//1. int array
		//Array - we can store multiple similar data type value 
		//Array Disadvantage - 1.Size is fixed, can not go beyond the size -- to overcome this problem we use collection 
		//ArrayList, HashTable - use dynamic array 
		//2. can store only similar data type value -- to overcome this problem we use object array 
		int i[]= new int[4]; //Deceleration of array 
       i[0] =10;	
       i[1]=20;
       i[2]=30;
       i[3]=40;
       System.out.println(i[0]);
       System.out.println(i[1]);
       System.out.println(i[2]);
       System.out.println(i[3]);
      // System.out.println(i[4]);  - It will throw ArrayIndexOutOfBoundsException as this index is not available
       System.out.println(i.length);
       for(int j=0;j<i.length;j++) {
    	  System.out.println(i[j]); 
       }
       //2.double array 
       double d[]=new double[3];
       d[0]=12.98;
       d[1]=13.09;
       d[2]=14.11;
       System.out.println(d[1]); 
       System.out.println(d[2]);
       
       //char Array
       
       char c[]=new char[2];
       c[0]='c';
       c[1]='d';
       System.out.println(c[1]);
       //System.out.println(c[3]); //will throw ArrayIndexOutOfBoundsException since index is not available 
       //boolean array 
       boolean b[]=new boolean[2];
       b[0]= true;
       b[1]=false;
       System.out.println(b[0]);
       
       //string array
       String s[]=new String[2];
       s[0]="Java";
       s[1]="Learning";
       System.out.println(s.length);
       System.out.println(s[0]);
       System.out.println(s[1]);
       
       //Object Array - it is used to store multiple data type
       Object obj[]=new Object[5];  //Object is a super class so started with capital letter 
       
       obj[0]= "Tom";
       obj[1]=12.56;
       obj[2]=26;
       obj[3]='M';
       obj[4]=true;
       System.out.println(obj[0]);
       System.out.println(obj[2]);
       System.out.println(obj[3]);
       System.out.println(obj.length);
       for(int j=0;j<obj.length;j++) {
    	   System.out.println(obj[j]);
    	   }
       }
	}


