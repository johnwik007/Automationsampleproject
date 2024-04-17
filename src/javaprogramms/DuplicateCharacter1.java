package javaprogramms;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateCharacter1 {

	 public static void main(String[] args) {
	 String s= "suubol kkumar";
	 
	 Set<Character> set= new LinkedHashSet();
	 
	 for(int i=0;i<s.length();i++)
	 {
		 set.add(s.charAt(i));
	 }
	  
	 for(Character c : set)
	 {
		 System.out.print(c);
	 }
	 
		 
	}	  
}
