package se.mosverkstad.mosjava.leetcode.aam.romanToInt;

import java.util.HashMap;

public class Solution {
	private HashMap<Character, Integer> base = new HashMap<Character, Integer>(){
		{put('M', 1000); put('D', 500);	put('C', 100); put('L', 50); put('X', 10); put('V', 5); put('I', 1);}
	};
	
	public int romanToInt(String str) {
		int num = 0;
		for (int i = 0, len = str.length(); i < len; i++) {
			if ((i != len - 1) && base.get(str.charAt(i)) < base.get(str.charAt(i + 1))) {
				num += base.get(str.charAt(i + 1)) - base.get(str.charAt(i));
				i += 1;
			} else {
				num += base.get(str.charAt(i));
			}
		}
		return num;
	}
	
	public int romanToIntRaw(String str) {
		int num = 0;
		int i = 0, len = str.length();
		while (i < len) {
			if (i == len - 1) {
				num += base.get(str.charAt(i));
				i++;
			} else {
				if (str.charAt(i) < str.charAt(i + 1)) {
					num += base.get(str.charAt(i + 1)) - base.get(str.charAt(i));
					i += 2;
				} else {
					num += base.get(str.charAt(i));
					i++;
				}
			}
			
		}
		return num;
	}
}
