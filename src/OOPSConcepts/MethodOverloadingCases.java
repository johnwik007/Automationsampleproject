package OOPSConcepts;

//method overloading with type promotion 
//byte short---->
 //               int long float double
 //    char--->




public class MethodOverloadingCases {
	
 void show(int a)
 {
	 System.out.println("int method");
 }

 void show(String s)
 {
	 System.out.println("string method");
 }
	public static void main(String[] args) {
	MethodOverloadingCases obj= new MethodOverloadingCases();
		 obj.show('a');

	}

}
