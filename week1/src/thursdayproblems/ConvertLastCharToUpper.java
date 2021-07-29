package thursdayproblems;

import java.util.Arrays;


public class ConvertLastCharToUpper {

	public static void main(String[] args) {
		String s = "hai how are you";
		String s1 = lastChartoUpper(s);
		System.out.println(s1);

	}
	
	public static String lastChartoUpper(String s) {
		String s1[] = s.split(" ");
		for(int i = 0; i<s1.length;i++) {
			s1[i] = s1[i].substring(0, s1[i].length()-1) + Character.toUpperCase(s1[i].charAt(s1[i].length()-1));
		}
		return Arrays.toString(s1);
		
	}

}
