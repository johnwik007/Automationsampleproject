package constructorandfile;

class A
{

void m1()
{
	System.out.println("m1 method class A");
}

}


public class Super1  extends A{
	void m1()
	{
		System.out.println("m1 method class super1");
	}

	void show()
	{
		super.m1();    // super class can be used to invoke parent class method
		System.out.println("show method");
	}
	
	public static void main(String[] args) {
		Super1 obj= new Super1();
		obj.show();
		obj.m1();

	}

}
