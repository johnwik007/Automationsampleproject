package javacollectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListClass {

	public static void main(String[] args) {
		
	ArrayList<String>	name= new ArrayList<String>();
	  name.add("Rakesh");
	  name.add("Pawan");
	  name.add("Vijay");   
	  name.add("Vijay");           // List allow duplicate element
	  System.out.println(name);
	  
	// to get/retrieve particular object from the ArrayList
	  String var = name.get(1);
	  System.out.println(var);
	  
	// to get all the objects from the ArrayList(using for each loop bcoz foreach loop only used in array)
	   for(String z: name)
	   {
		 System.out.println(z);  
	   }
	   
	// to get all the objects from the ArrayList using iterator() method
	   
       Iterator itr = name.iterator();
       while(itr.hasNext())
       {                                         //hasNext(): to check the objects available or not.
       	                                         // Next() : to retrieve the objects
         String str = (String) itr.next();
        System.out.println(str);
       } 
	  
	  
	  
	 // add(Object o)   This method is used to append a specific element to the end of a list. 
	    name.add("anish");
	    System.out.println(name);
	  
	 
	 // add object at first index position
	    name.add(1,"rohit");
	    System.out.println(name);
	 
	 
	 // add mahesh at the beginning
	    name.add(0,"mahesh");
	    System.out.println(name);
	    
	  
	  ArrayList<String>	name1= new ArrayList<String>();
	  name1.add("srk");
	  name1.add("allu");
	  name1.add("raj");
	  name1.add("dev");
	  System.out.println(name1);
	  
	  
	  // addAll()method used to add one collection object into another collection.
         name.addAll(name1);
	     System.out.println(name);
	     
	  
	  //  add aaa object in name arraylist if added successfully then return true else false
	      name.add("aaa");
	      System.out.println(name);
	      
	    //Replace mahesh with rohit from this arraylist    
	   name.set(0, "rohit");
	   System.out.println(name);
	  
     //contains(object o) method to check object is available or not,  if present then return true else false
	  System.out.println(name.contains("srk"));
	  
	  
	  // isEmpty() to check objects are available or not , return type is boolean(true or false)
	     System.out.println(name.isEmpty());
	     
	  
	  // size() to find the size of arraylist , return type is integer
	     System.out.println(name.size());
	  
	     //remove() it removes Objects from ArrayList based on Object & index.
	       System.out.println(name.remove(11));
	       System.out.println(name);
	      
	    //  Clear() to remove all objects from ArrayList.
            name.clear();
	        System.out.println(name);
	        
	     ArrayList al= new ArrayList();
	   	 al.add("john");
	   	 al.add(10);
	   	 al.add('c');
	   	 System.out.println(al);
	   	 
	  // 	Retrieving objects of collections classes:-
	 //  	We are able to retrieve the objects from collection classes in 3-ways
	 //  	1) By using for-each loop.
	 //  	2) By using get() method.
	 //  	3) By using cursors
	   	 
	         int varr = al.size(); 
	         for(int i=0;i<varr;i++)
	         {
	        	  
                System.out.println(al.get(i));
	         }
	         
	         
	
	      
		  
	}	

}
