package javaprogramms;

public class PrintDigitsFromAString {

	public static void main(String[] args) {
		String s= "I love my world1234";
		 char []ch =s.toCharArray();
		 for(char a: ch)
		 {
			 if(Character.isDigit(a))
		     System.out.println("Print digits are:" + a);
		 }
		 
	// or	 
		 
		 String s1= "I love my world1234";
		  String result1 = s1.replaceAll("[^0-9]", "");
		  System.out.println(result1);
	    
		 
		 
	}

}
