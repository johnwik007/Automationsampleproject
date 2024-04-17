package OOPSConcepts;

abstract class Copy
{
	 abstract void display();
	  void show()
      {
    	  
	   System.out.println("1");
	 
      }
}

public class OverridingAdvance  extends Copy {
	
	void display()
	{
		System.out.println("3");
	}

	void show()
	{
		super.show();           // using super keyword we can call the parent class method
		System.out.println("2");
	}
	
	public static void main(String[] args) {
	 OverridingAdvance obj= new OverridingAdvance();
	  obj.show();
	  obj.display();
	  
	 
		

	}

}
