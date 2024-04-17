package OOPSConcepts;

abstract class Mac
{
	abstract void m1();
	void m2()
	{
		System.out.println(" m2 method");
	}
	
}

abstract class Book extends Mac
{
	void m1()
	{
		System.out.println("abstract m1 method");
	}
	abstract void m2();
}

public class Abstraction1 extends Book {
	void m2()
	{
		System.out.println("abstract m2 method");
	}

	public static void main(String[] args) {
		Abstraction1 ab1= new Abstraction1();
		            ab1.m1();
		            ab1.m2();
		            
		

	}

}
