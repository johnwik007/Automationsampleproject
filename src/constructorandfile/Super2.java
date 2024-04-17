package constructorandfile;
class Copy
{
	Copy()
	{
		System.out.println("i am class A");
	}
}

public class Super2 extends Copy {
	Super2()
	{
		super();                       //  super() can be used to invoke parent class constructor
		System.out.println("i am class super2");
	}

	public static void main(String[] args) {
		 Super2 obj = new Super2();

	}

}
