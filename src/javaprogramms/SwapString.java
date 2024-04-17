package javaprogramms;

public class SwapString {

	public static void main(String[] args) {
	  String s= "My name is subol";
	  String a[]= s.split(" "); 
	                                           //By using split() method we are dividing string into number of tokens.
	  int n=a.length;
	  
	   for(int i=n-1;i>=0;i--)
	  {
		   
		 System.out.print(a[i] + " ");           //subol is name My
		  
	   }

	}

}
