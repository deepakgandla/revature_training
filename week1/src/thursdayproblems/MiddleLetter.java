package thursdayproblems;

import java.util.Scanner;

public class MiddleLetter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(middleLetter(s));
		sc.close();
		}
	
	 public static String middleLetter(String s) {
		   if(s.length()%2==0) {
			   return Character.toUpperCase(s.charAt(0)) + s.substring(1, s.length()-1);
		   }
		   else {
			   int mid = s.length()/2;
			   char c = Character.toUpperCase(s.charAt(mid-1));
			   return s.substring(0, mid) + c + s.substring(mid+1, s.length());
		   }
		   
	   }
  
}
