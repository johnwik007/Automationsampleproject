package javacollectionframework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {

	public static void main(String[] args) {
    HashSet<String> h = new HashSet<String>();
    h.add("tiger");
    h.add("lion");
    h.add("goat");
    h.add("john");
    h.add("wic");
    h.add("tiger");         // Set does not alow duplicate element
    System.out.println(h);
    
    
  // to get all the object from the hashset using iterator() method  
    Iterator  itr = h.iterator();
    while (itr.hasNext())
    { 
    	String str =(String) itr.next();
    System.out.println(str);
    }

    
 // to get all the object from the hashset using foreach loop  
     for(String a: h)
     {
    	 System.out.println(a);
     }
    
    
	}

}
