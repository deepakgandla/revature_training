package firstpack;

import java.util.Arrays;

public class Demo1 {
	public static void main(String args[]) {
		System.out.println(convertStringtoArray("hai hello welcome here and good"));
		System.out.println(isPalindrome("madam"));
	}
	
	public static boolean isPalin(String s) {
		return new StringBuffer(s).reverse().toString().equals(s);
	}
	
	public static String convertStringtoArray(String s) {
		String s1[] = s.split(" ");
		for(int i = 0; i<s1.length; i++) {
			s1[i] = Character.toString(Character.toUpperCase(s1[i].charAt(0))) + s1[i].substring(1, s1[i].length());
		}
		return Arrays.toString(s1);
	}
	
	public static boolean isPalindrome(String s) {
		StringBuffer sb = new StringBuffer(s);
		String s1 = sb.reverse().toString();
		return s.equals(s1);
		
		}

}
