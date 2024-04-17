package constructorandfile;

public class ParametrizedConstructor {
	
	ParametrizedConstructor()
	{
		this(100);
	}

	
	ParametrizedConstructor(int a)
	{
		System.out.println("java coding");
	}
	
	public static void main(String[] args) {
		

		ParametrizedConstructor obj = new ParametrizedConstructor();	
	}

}
