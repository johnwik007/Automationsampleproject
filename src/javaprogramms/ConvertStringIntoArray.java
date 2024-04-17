package javaprogramms;

import java.util.Arrays;

public class ConvertStringIntoArray {

	public static void main(String[] args) {
		 String s= "Automation";
		 char[] ch  = s.toCharArray();
		 System.out.println(Arrays.toString(ch));   // [A, u, t, o, m, a, t, i, o, n]
	}

}
