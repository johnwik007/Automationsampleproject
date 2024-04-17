package constructorandfile;

public class This2 {
	
	This2()
	{
		System.out.println("no arg constructor");
	}
	
	This2(int a)
	{
		this();                               //  this() keyword can be used to invoke current class constructor
		System.out.println("parametrized constructor");
		
	}

	public static void main(String[] args) {
	   This2 obj = new This2(10);
	    

	}

}
