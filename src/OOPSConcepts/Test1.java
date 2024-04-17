package OOPSConcepts;

// inheritance concepts

class Test
{
	void show()
	{
		System.out.println("inside a parent class");
	}
}

 public class  Test1 extends Test {
	  
	void eat()
	{
		System.out.println("inside a child class");
	}

	public static void main(String[] args) 
	{	
	 Test1 obj = new Test1();
	      obj.eat();
	   Test t= new Test();
	      t.show();
	     obj.eat();  

	}

}
