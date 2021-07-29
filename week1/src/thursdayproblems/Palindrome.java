package thursdayproblems;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 String s = sc.nextLine();
	 String s1[] = s.split(" ");
	 for(String word: s1) {
		 System.out.println(isPalin(word));
	 }
	 sc.close();
 	}
               
	
	public static String isPalin(String s) {
		  
		
			if(isPalindrome(s)) {
				return s;
			}
			else {
				StringBuffer sb = new StringBuffer(s);
				return sb.reverse().toString();
			}
	}
	
	public static boolean isPalindrome(String s) {
		StringBuffer sb =new StringBuffer(s);
		sb.reverse();
		return s.equals(sb.toString());
	}
}
