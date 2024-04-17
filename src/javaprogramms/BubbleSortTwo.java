package javaprogramms;

public class BubbleSortTwo {

	public static void main(String[] args) {
		
		int a[]= {2,4,7,5,1,9,3,6,8};
	    
		for(int i=0;i<a.length; i++)
          {
        	for(int j=0;j<a.length-1;j++)
        	  {
        		
        		if(a[j]>a[j+1])
        		  {
        		    int temp =a[j];
        		     a[j]=a[j+1];
        		     a[j+1]= temp;
        		     
        	       }
               }
		  }
		
		for(int i=0;i<a.length; i++)
		{
		    System.out.print(a[i]+ " "); 
		    
		}
	}

}
