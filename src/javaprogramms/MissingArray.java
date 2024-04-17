package javaprogramms;

import java.util.Arrays;
import java.util.HashSet;
public class MissingArray {

	public static void main(String[] args) {
	int a[]= {3,1,7,6,8,4,9};
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	
     HashSet hs = new HashSet();	
	
	for(int n: a)
	{
	  hs.add(n);
	}

	for(int i=1;i<a.length;i++)
	{
		if(! hs.contains(i))
	  {
		System.out.println("missing no is:" +i);
		
	  }
  }
	
	
}

}
		
