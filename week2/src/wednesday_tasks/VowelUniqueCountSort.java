package wednesday_tasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class VowelUniqueCountSort {
	public static void main(String args[]) {
		String s = "aeeeeeeeeeeeee aee aeio aeiou s";
		System.out.println(vowelUniqueCountSort(s));
	}
	
	public static String vowelUniqueCountSort(String s) {
		Map<Integer, String> mp = new HashMap<Integer, String>();
		String arr[] = s.split(" ");
		Arrays.sort(arr, Collections.reverseOrder());
		for(String word: arr) {
			int len = 0;
			Set<Character> st = new HashSet<>();
			for(int i=0;i<word.length();i++) {
				Character c = word.charAt(i);
				if(st.contains(c)==false) {
					if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
						len++;
						st.add(c);
					}
				}
				

			}
			if(mp.containsKey(len)) {
				String temp = mp.get(len);
				temp = temp + " " + word;
				mp.put(len, temp);
			}else {
				mp.put(len, word);
			}
		}
		String res = "";
		for(Entry<Integer, String> e: mp.entrySet()) {
			res = e.getValue() + " " +  res;
		}
		return res;
	}
}
