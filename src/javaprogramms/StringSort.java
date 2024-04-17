package javaprogramms;

public class StringSort {

	public static void main(String[] args) throws Exception { 
		 String s= "apple";  
		 char ch[] = s.toCharArray();
	     
	    for(int i= 0;i<ch.length-1;i++)
	    {
	    	for(int j=0;j<ch.length-1;j++)
	    	{
	    		if(ch[j]>ch[j+1])
	    		{
	    			char temp = ch[j];
	    			ch[j]=ch[j+1];
	    			ch[j+1]=temp;
	    		}
	    	}
	   
	    	
	    }
	    
	         System.out.println(ch);
	   }

}
