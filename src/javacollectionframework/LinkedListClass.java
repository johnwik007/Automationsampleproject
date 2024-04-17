package javacollectionframework;

import java.util.LinkedList;

public class LinkedListClass {

	public static void main(String[] args) {
		
	LinkedList<String>	name= new LinkedList<String>();
	
	  name.add("Rakesh");
	  name.add("Pawan");
	  name.add("Vijay");
	  name.add("john");
	  name.add("wick");
	  name.add("subol");
	  System.out.println(name);
	  
	 
	  name.addFirst("srk");        // add object in first position
	  System.out.println(name);  
	 
	                           
	 name.addLast("aamir");        // add object in last position
	 System.out.println(name);
	 
	
	 name.add(3, "salman");         //add the Object spcified index
	 System.out.println(name);
	 
	 
	 name.removeFirst();            // remove first Object
	 System.out.println(name);
	 
	 name.removeLast();             //remove last t Object
	 System.out.println(name);
	 
	 name.remove("john");           //remove particular Object
	 System.out.println(name); 
	 
	 
	 name.remove(2);               //remove the object based on  index position
	 System.out.println(name);
	 
	  String var = name.get(3);    //get method used to get the element/object passing index value
	  System.out.println(var);
	  
	 
	// to get all the object from the linkedlist using foreach loop
	 for(String str: name)                  
	{
		System.out.println(str);	
	}
	 
	 
	 
	 
	}

}
