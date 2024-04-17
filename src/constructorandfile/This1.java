package constructorandfile;

public class This1 {
	
  void display()       // this keyword is used to invoke current class method
  {
	  System.out.println("hello");
  }
  
  void show()
  {
	  this.display();       // display();   both are same
  }

	public static void main(String[] args) {
	    This1 obj = new This1();
	        obj.display();


	}

}
