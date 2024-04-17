package javaprogramms;

public class DuplicateElemenent {

	public static void main(String[] args) {
	 int a[]= {3,5,6,3,2,8,5,8};
	 for(int i=0;i<a.length;i++)
	 {
		 for(int j=i+1;j<a.length;j++)
		 {
			 if(a[i]==a[j])
			 {
				 System.out.println("Duplicate element is:"+a[i]);
			 }
		 }
	 }

	}

}
