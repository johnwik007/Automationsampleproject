package javaprogramms;

public class RemoveSpace {

	public static void main(String[] args) {
		String s= "Test Automation";
        String s1=s.replaceAll(" ", "");
        System.out.println(s1);
        
         String s2=s.replaceAll("Test\\s", ""); 
         System.out.println(s2);
		

	}

}
