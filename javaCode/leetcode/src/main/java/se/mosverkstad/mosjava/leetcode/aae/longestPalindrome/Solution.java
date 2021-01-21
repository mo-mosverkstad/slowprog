package se.mosverkstad.mosjava.leetcode.aae.longestPalindrome;

public class Solution {
	
	public String longestPalindrome(String str) {
		return this.longestCommonSubstring(str, new StringBuilder(str).reverse().toString());
	}
	
	public String longestCommonSubstring(String str1, String str2) {
		int maxLen = 0, endIndex = 0;
		int len1 = str1.length(), len2 = str2.length();
		int[][] lookup = new int[len1 + 1][len2 + 1];
		
		for (int i = 1; i <= len1; i++) {
			for (int j = 1; j <= len2; j++) {
				if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
					lookup[i][j] = lookup[i - 1][j - 1] + 1;
					if (lookup[i][j] > maxLen) {
						maxLen = lookup[i][j];
						endIndex = i;
					}
				}
			}
		}
		return str1.substring(endIndex - maxLen, endIndex); 
	}
}
