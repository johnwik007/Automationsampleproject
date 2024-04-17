package javaprogramms;

public class Minimum {

	public static void main(String[] args) {
		int a[]= {10,15,20,5,30,50};
		  int min=a[0];
		  for(int i=0;i<a.length;i++)
	 {
			  if(a[i]<min)
			  {
				  min=a[i];
				  
			  }
				 
		  }
		  
	       System.out.println("minimum value is:" +min);
	 }

}
