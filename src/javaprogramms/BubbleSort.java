package javaprogramms;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int a[]= {2,4,7,5,1,9,3,6,8};
	    int  n = a.length;
		for(int i=0;i<n-1; i++)
       {
        	for(int j=0;j<n-1;j++)
           {
        		
        		if(a[j]>a[j+1])
        		{
        		   int temp =a[j];
        		     a[j]=a[j+1];
        		     a[j+1]= temp;
        		     
        	     }
        		
            }
	    }
		
		  System.out.println(Arrays.toString(a));
         
          
	}
}

