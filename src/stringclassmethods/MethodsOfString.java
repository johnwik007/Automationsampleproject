package stringclassmethods;

public class MethodsOfString {

	public static void main(String[] args) {
	String s1= "subol";
	String s2= "subol";
	System.out.println(s1.compareTo(s2));    //CompareTo()  if  two strings are equal then it return zero return type is integer
                                              
	String name= "puja";
	char value = name.charAt(3);  //   charAt(index) method we are able to extract the character from particular index position. 
	System.out.println(value);    //  and return type is char 
	
	String str= "Hi subol how are you"; 
	String[] value1 = str.split(" ");   // using split() method we are dividing string into number of tokens and return string array
	for(String s : value1)
	{
		System.out.println(s);
	}
	 
	 String str1= "  raj mallick  ";
	 String var = str1.trim();         //trim() method removes only the leading and trailing spaces in the string
	 System.out.println(var);          // and return type is string
	
	
	  String s= "subol how r u";
	  System.out.println(s.replace('l', 'L'));    //replace() method used to replace the String or character and return type is string
	  System.out.println(s.replace("how","who"));
	  System.out.println(s.replaceFirst("o", "w")); //  //replaceFirst() method used to replace the String first time and return type is string
	  System.out.println(s.replaceAll("l", "L"));   //  replaceAll() method is used to replace the string and return type is string
	  System.out.println(s.replaceAll("l(.)", "L"));
	  
	  String st= "HOW ARE YOU";
	  System.out.println(st.toLowerCase());    // toLowerCase() methods are used to convert upper case to lower case and return string value
	  String st1= "i love coding";
	  System.out.println(st1.toUpperCase());   // toUpperCase() methods are used to convert lower case to upper case and return string value
	 
	  String strr= "Hi love u babu";
	  System.out.println(strr.endsWith("u"));  //endsWith() is used to find out if the string is ending with particular character/string or not.
	                                           // return type is boolean(true or false)
	  System.out.println(strr.startsWith("H")); //startsWith() used to find out the particular String starting with particular character/string or not.
	                                            //return type is boolean(true or false)
	  
	  String swt="This is demo";
	  System.out.println(swt.substring(2));         //substring() method used to find substring in main String.
      System.out.println(swt.substring(1,7));       //subSequence() method is used to find subsequence in main string 
      
      System.out.println(swt.subSequence(3, 5));   
      
	}

}
