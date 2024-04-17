package javaprogramms;

public class EvenOddOfAnArrray {

	public static void main(String[] args) {
		int a[]= {2,3,4,8,10,1};
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("even no is:" +a[i]);
			}	
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println("odd no is:" +a[i]);
			}
		}
   }
		 
		 
		 
	}

	

