package javaprogramms;

public class Maximum {

	public static void main(String[] args) {
	 int a[]= {5,10,15,20,30,50};
	  int max=a[0];
	  for(int i=0;i<a.length;i++)
	  {
		  if(a[i]>max)
		  {
			  max=a[i];
			  
		  }
			 
	  }
	  
       System.out.println("maximum value is:" +max);
       
       
	}

}
