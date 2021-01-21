package se.mosverkstad.mosjava.leetcode.aac.longestSubstring;

import java.util.HashMap;

public class Solution {
	
	public int lengthOfLongestSubstring(String string) {
		int maxLength = 0, startIndex = 0, endIndex = 0;
		int windowSize = 0, leftIndex = 0;
		HashMap<Character, Integer> window = new HashMap<Character, Integer>();
		for (int i = 0; i < string.length(); i++) {
			Character currentChar = string.charAt(i);
			if (window.containsKey(currentChar)) {
				leftIndex = window.get(currentChar) + 1;
			}
			windowSize = i - leftIndex + 1;
			window.put(currentChar, i);
			if (windowSize > maxLength) {
				maxLength = windowSize;
				startIndex = leftIndex;
				endIndex = i;
			}
		}
		System.out.println(String.format("The original string is: %s; "
				+ "and the longest substring without repeated char is: %s.",
				string,
				string.substring(startIndex, endIndex + 1)));
		return maxLength;
	}
}
