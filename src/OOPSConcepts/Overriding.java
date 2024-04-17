package OOPSConcepts;

class Parent
{
	void Property()
	 {
		System.out.println("money+land+house");
	 }
	
	   void marry()                         //overridden method
	  {
		System.out.println("white girl");
	  }
}

     public class Overriding  extends Parent
     { 
	  void marry()                            //overriding method
	  {
		System.out.println("black girl");
	  }

	public static void main(String[] args) 
	{	
          Overriding obj = new Overriding();
          obj.marry();
          obj.Property();
          
  // to call parent class method marry() create parent class object
        Parent p = new Parent();
        p.marry();
          
	}

}
