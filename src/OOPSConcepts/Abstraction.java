package OOPSConcepts;

abstract class Sample
{
	abstract void m1();
	abstract void m2();	
	void show()
	{
		System.out.println("I am show method");
	}
}

public class Abstraction  extends Sample{
	void m1()
	{
		System.out.println("m1 method");
	}
	void m2()
	{
		System.out.println("m2 method");
	}

	public static void main(String[] args) {
		
		Abstraction ab= new Abstraction();
		      ab.m1();
		      ab.m2();
		      ab.show();
		      
		      
	//	Sample s = new Sample();  cannot create object for  abstract class
		 

	}

}
