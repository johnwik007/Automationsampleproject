package statickeyword;

public class StaticVariable {
	
	static int a= 10;           //  static variable used at clsss level
     void show()               // static variable are used for memory management
     {
  //  	 static int b= 20;      // cannot assign in local variable with static keyword
     }
	public static void main(String[] args) {
		
         System.out.println(StaticVariable.a);  // 10  (static variable belongs to class not object and classed directly using classname)
	 	                                                  
	}

}
