package flowcontrolstatements;

public class IfElsePrograme {

	public static void main(String[] args) {
	int age= 25;
	if(age>20)              //  If statmenet is taking condition that condition must be Boolean condition. Otherwise compiler will 
	                        // Otherwise compiler will generate error message.
	{
		System.out.println("boy can drive");
		
	}
	else
	{
		System.out.println("boy cannot drive");
	}
	
	if(age==25)              // cannot use = in If condition
	{
		System.out.println("yes boy you can drive");
	}

	else
	{
		System.out.println("yes boy you cannot drive");
	}
	
}

}
