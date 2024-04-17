package constructorandfile;

   class Test 
   {
    int a=10;
   }

    public class SuperKeyword extends Test {
    int a=20;
    void show()
   {
	
	System.out.println(super.a);      // 10
	System.out.println(a);            //20
	System.out.println(this.a);       //20                      
   }
    

	public static void main(String[] args) {
		SuperKeyword s= new SuperKeyword();
	       s.show();
	
			

	}

}
