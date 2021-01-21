package se.mosverkstad.mosjava.leetcode.aaj.regularExpression;

public class Solution {
	public boolean isMatch(String str, String pattern) {
		if (str.isEmpty()) return pattern.isEmpty();
		if (pattern.isEmpty()) return false;
		
		if (pattern.length() == 1) {
			if (str.length() == 1 && (pattern.equals(str) || pattern.equals("."))) return true;
			return false;
		}
		
		if (pattern.charAt(1) != '*') {
			if (str.charAt(0) == pattern.charAt(0) || pattern.charAt(0) == '.') return isMatch(str.substring(1), pattern.substring(1));
			return false;
		}
		
		int strPoint = 0;
		while (strPoint < str.length() && (str.charAt(strPoint) == pattern.charAt(0) || pattern.charAt(0) == '.')) strPoint++;
		return isMatch(str.substring(strPoint), pattern.substring(2));
	}
}
