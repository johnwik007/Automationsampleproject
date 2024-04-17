package javacollectionframework;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListClassAdvance {

	public static void main(String[] args) {
		
   // Sorting data by using sort() method of Collections class:-
        
        ArrayList<String> al = new ArrayList<String>();
        al.add("ratan");
        al.add("anu");
        al.add("Sravya");
       
        for (String str :al)
        { 
       	 System.out.println(str);
        } 
        
        //sorting ArrayList in ascending order
        Collections.sort(al);
        for (String str1 :al)
        {
       	 System.out.println(str1);
        }
        
        
        //sorting ArrayList in decending order
        Collections.sort(al,Collections.reverseOrder());
        
        for (String str2 :al)
        { System.out.println(str2);
        }   
        

	}

}
