package javaprogramms;

public class ReplaceSpecialCharacterAndAll {

	public static void main(String[] args) {
		String s="$123@#%abcdABCD()";
		String str = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);
		

	}

}
