package wednesday_tasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class VowelCountSort {
	public static void main(String args[]) {
		String s = "ee aei aeeeeeeeeeee aeio aeiou s";
		System.out.println(vowelCountSort(s));
	}
	
	public static String vowelCountSort(String s) {
		Map<Integer, String> mp = new TreeMap<Integer, String>();
		String arr[] = s.split(" ");
		Arrays.sort(arr, Collections.reverseOrder());
		for(String word: arr) {
			int len = 0;
			for(int i=0;i<word.length();i++) {
				char c = word.charAt(i);
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
					len++;
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
		//StringBuffer sb = new StringBuffer();
//		for(Entry<Integer, String> e: mp.entrySet()) {
//			sb.append(e.getValue() + " ");
//		}
		String res = "";
		for(Entry<Integer, String> e: mp.entrySet()) {
			res = e.getValue() + " " +  res;
		}
		return res;
	}
}
