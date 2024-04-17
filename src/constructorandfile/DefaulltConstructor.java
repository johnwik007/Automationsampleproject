package constructorandfile;

public class DefaulltConstructor {
	
	DefaulltConstructor()
	{
		System.out.println("java coding");
	}
	
	DefaulltConstructor(int a,String s)
	 {
		this();
		System.out.println(a);
		System.out.println(s);
	}

	public static void main(String[] args) {
		
		DefaulltConstructor obj = new DefaulltConstructor(100,"subol");
	}

}
