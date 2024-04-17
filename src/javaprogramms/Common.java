package javaprogramms;

public class Common {

	public static void main(String[] args) {
	 int a[] = {2,4,6,7,9};
	 int b[] = {4,6,2,5,1};
	 
	 for(int i=0;i<a.length;i++)
	 {
		  for(int j=0;j<b.length;j++)
		{
			  if(a[i]==b[j])
			  {
				 System.out.println(a[i]);
			  }
	     }
    
	  }
	 
	  
	}
}
