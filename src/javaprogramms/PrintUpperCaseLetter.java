package javaprogramms;

public class PrintUpperCaseLetter {

	public static void main(String[] args) {
	 String s= "Automation Test Engineer";
	  char  ch[] = s.toCharArray();
	  int count = 0;
	   
	   for(char a: ch)
	  {
	    if(Character.isUpperCase(a))
		   {
	           System.out.println("Print Uppercase letter:" + a);
			         count++;
		   }
	    
	    }
	   
             System.out.println(" Total Uppercase letter is:" + count);
         
    
    
	}

}
       