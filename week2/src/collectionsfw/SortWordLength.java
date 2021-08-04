package collectionsfw;

import java.util.Scanner;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
public class SortWordLength {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		System.out.println(sortOnWordLength(s));
		
	}
	
	public static String sortOnWordLength(String s) {
		String arr[] = s.split(" ");
		Map<Integer, String> mp = new HashMap<Integer, String>();
		for(String word: arr) {
			int length = word.length();
			if(mp.containsKey(length)) {
				String temp = mp.get(length);
				temp = temp + " " + word;
				mp.put(length, temp);
				
			}else {
				mp.put(length, word);
			}
		}
		StringBuffer sb = new StringBuffer();
		for(Entry<Integer, String> e: mp.entrySet()) {
			sb.append(e.getValue() + " ");
		}
		return sb.toString().trim();
	}
}
