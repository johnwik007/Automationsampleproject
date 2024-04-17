package javacollectionframework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapClass {

	public static void main(String[] args) {
		HashMap h = new HashMap();
		h.put(111,"ratan");
		h.put(222,"anu");
		h.put(333,"banu");
		h.put(444, "anu");      // In Map  "key"  should be unique but   "value"   can be duplicate
		System.out.println(h);
		
		//to get all keys.
		 Set s1 = h.keySet();
		 System.out.println("all keys:"+s1);
		 
		 // to get all the values
		  Collection c = h.values();
		  System.out.println("all values:"+c);
		  
		 // to get all the entries. 
		 Set s2 = h.entrySet();
		 System.out.println("all entries:"+s2);
		 
		////entrySet() to get all the entries.       
		    Iterator itr = s2.iterator();
		     while (itr.hasNext())
		    {
		    	Map.Entry m= (Map.Entry)itr.next();
		    	
		       System.out.println(m.getKey()+"----"+m.getValue()); 
		    
		    }

	}

}
