
public class RemoveJunkSpecial {

	public static void main(String[] args) {
		// How to replace junk/special character - using regular expression/ use replaceAll function to replace 
   String s ="@#@@%@ Learn @$^%@^%@ Seleneium ^*^*(&()) Java"; //String is immutable object 
   String s1 = "@#@@%@ Pravesh @$#%@#%@ Learning **(&()) Seleneium";
   String s2 = "Pravesh @$#%@#%@ Chourasia";
   s = s.replaceAll("[^a-zA-Z0-9]", " ");  //we can remove the junk/special 
   //characteer from string by using regular expression along with replaceAll function  
   System.out.println(s);
   
   s1 = s1.replaceAll("[^a-zA-z0-9]", " ");
   System.out.println(s1);
  
  
	}

}
