package javaprogramms;

public class CountCharacterInString {

	public static void main(String[] args) {
	String s= "Test Automation";
	int count = 0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)!=' ');
		 count++;
	}
     System.out.println(count);
	}

}
