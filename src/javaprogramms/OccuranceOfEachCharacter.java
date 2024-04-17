package javaprogramms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OccuranceOfEachCharacter {

	public static void main(String[] args) {
	String s= "Today is monday and tomorrow is tuesday";
	s = s.replace(" ", ""); 
	char ch[]= s.toCharArray();
	int count = 0;
	Map map= new HashMap();
     
	 for(int i=0;i<ch.length;i++)
	  {
		 count=0;
		  
		  for(int j=0;j<ch.length;j++)
		  {
			  if(ch[i]==ch[j])
			  {
				  count++;
			  }
		  }
		  
		  map.put(ch[i],count); 
		 
	  }
	  
	      System.out.println(map);  
	

	}

}
