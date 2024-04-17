package statickeyword;

public class StaticMethod {
	
  static void show()                       // static method belong to class not in object 
  {                                       // static method can be accessed directly by class name
	                                       // static method can access only static data cannot access non static data
	  System.out.println("this is static method");
  }
	public static void main(String[] args) {
	
		 StaticMethod.show();        //  to call static method using class name
              show();                // directly call static method  within a class no need to write StaticMethod.show();
                                           
          XYZ.display();          //   to call xyz class we need class name     
                                 // static method cannot refer to this or super keyword
	}
	

 class XYZ
 {
	 static void display()
	 {
		 System.out.println("xyz class method");
		 
	 }
 }
	
}
