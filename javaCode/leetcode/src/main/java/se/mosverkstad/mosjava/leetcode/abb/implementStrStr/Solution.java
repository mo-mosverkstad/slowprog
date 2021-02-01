package se.mosverkstad.mosjava.leetcode.abb.implementStrStr;

public class Solution {
	public int strStr(String haystack, String needle) {
		if (needle.isEmpty()) return 0;
		int haystackLen = haystack.length(), needleLen = needle.length();
		for (int i = 0; i < haystackLen - needleLen; i++) {
			int j = 0;
			for (; j < needleLen; j++) {
				if (haystack.charAt(i + j) != needle.charAt(j)) break;
			}
			if (j == needleLen) return i;
		}
		return -1;
	}
	
}
