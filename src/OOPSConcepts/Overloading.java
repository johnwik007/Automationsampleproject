package OOPSConcepts;

public class Overloading 
{
	void show(int a)
	{
		System.out.println("int argument");
	}
	void show(String s)
	{
		System.out.println("string argument");
	}
	void show(char ch)
	{
		System.out.println("char Arguments");
	}
	
	public static void main(String[] args) {

      Overloading obj = new Overloading();
            obj.show(5);
            obj.show('a');
            obj.show("subol");
	}
	
	

}
