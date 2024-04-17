package javaprogramms;

public class RemoveDigitsFromString {

	public static void main(String[] args) {
	String s= "Java12Program";
      String result = s.replaceAll("[^a-zA-Z]", "");  // remove digits from string
	   System.out.println(result);
	   
	   
	   
	// OR   
	   
		  String s1= "I love my world1234";
		  String result1 = s1.replaceAll("[^0-9]", "");  // print digits from string
		  System.out.println(result1);
	   
	   
	   
	   
	   
	   
	   
	 
	}

}
