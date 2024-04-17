package javaprogramms;

public class ReverseString {

	public static void main(String[] args) {
		 String s= "I am giving my selenium interview"; // output: I ma gnivig ym muineles weivretni
		 String rev="";
		 int n=s.length();
		 
		 for(int i=n-1;i>=0;i--)
		 {
		    rev=rev+s.charAt(i);	 
		 }

		  System.out.println(rev);
	}

}
