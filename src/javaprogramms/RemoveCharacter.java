package javaprogramms;

public class RemoveCharacter {

	public static void main(String[] args) {
		String s= "Test Automation";
          s= s.replaceAll("Test\\s","");
		      
		      System.out.println("After removing:"  +s);
		      
		
	}

}
