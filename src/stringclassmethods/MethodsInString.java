package stringclassmethods;

import java.util.Arrays;

public class MethodsInString {

	public static void main(String[] args) {

	String s1="subol";
	String s2="subol";                     //  == operator is used for reference comparison(address comparison)
	System.out.println(s1==s2);            // == operator-->If two reference variables are pointing to same object then it returns true 
	System.out.println(s1.equals(s2));                                             //  otherwise false.
	
	String str1= new String("anu");      //equals() method is used for content comparison 
	String str2= new String("anu");      //It means equals() is used to check object value.
	System.out.println(str1==str2);
	System.out.println(str1.equals(str2));
	
	
	String name= "Amit";            // + operator is used to concate between two string
	String name1="Subol";
	System.out.println(name+name1); // AmitSubol 
	System.out.println(name+10);    //Amit10
	System.out.println(name+10+20); // Amit1020 
	System.out.println(10+20+name);  //30Amit
	System.out.println(10+name+20);  //10Amit20
	System.out.println(name+20/10);  //Amit2
  //  System.out.println(name+10-5);  getting error
	
	// concate() method is used to add two string
	System.out.println(name.concat(name1));  // AmitSubol  
	
    String s= "aheshbabu";
    System.out.println(s.indexOf('h'));  //indexOf() is used to find particular interger value based on index position
	                                      // return integer value
	System.out.println(s.lastIndexOf('h')); // lastIndexOf() method is used to find the interger value from the last 
	                                        // based on index position and return type is integer.
	
	int a=10;
	String value = String.valueOf(a);     //String.valueOf(char) method is used to convert integer to string and return String
	System.out.println(value);
	
	String namme= "deepak";
     char[] value1 = namme.toCharArray();
 	System.out.println(Arrays.toString(value1));
}
	    
}


