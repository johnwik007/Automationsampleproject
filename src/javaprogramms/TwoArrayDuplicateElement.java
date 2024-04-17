package javaprogramms;

public class TwoArrayDuplicateElement {

	public static void main(String[] args) {
	String[] names1 = new String[] {"Ava", "Emma", "Olivia", "Emma"};
	String[] names2 = new String[] {"Olivia", "Sophia", "Emma", "Sophia"};
	
	 for(int i=0;i<names1.length;i++)
	 {
		 for(int j=0;j<names2.length;j++)
		 {
			 if(names1[i]==names2[j])
			 {
				 System.out.println("duplicate element is:" + names1[i]);
			 }
		 }
	 }

	}

}








