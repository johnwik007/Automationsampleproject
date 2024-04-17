package javaprogramms;

public class SecondLargestElement {

	public static void main(String[] args) {
		int a[]= {2,6,9,6,7,30,40,35};
		 int  n =a.length;
		 for(int i=0;i<n-1;i++)
		 {
			 for(int j=0;j<n-1;j++)
			 {
				 if(a[j]<a[j+1])
				 {
					   int temp=a[j]; 
					   a[j]=a[j+1];
					   a[j+1]=temp;
				 }
			 
			 }
		 }
		 
		  System.out.println("second largest element is:"+a[1]); 
		 
		 }
	}


