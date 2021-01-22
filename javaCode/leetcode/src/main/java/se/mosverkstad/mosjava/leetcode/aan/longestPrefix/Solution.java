package se.mosverkstad.mosjava.leetcode.aan.longestPrefix;

public class Solution {
	
	public String longestCommonPrefix(String[] strs) {
		StringBuilder prefix = new StringBuilder();
		for (int charPoint = 0, charLen = strs[0].length(); charPoint < charLen; charPoint++) {
			char currentChar = strs[0].charAt(charPoint);
			boolean same = true;
			for (int strPoint = 1, strLen = strs.length; strPoint < strLen; strPoint++) {
				if ((charPoint > strs[strPoint].length() - 1) ||
						(currentChar != strs[strPoint].charAt(charPoint))) same = false;
			}
			if (same) prefix.append(currentChar);
			else break;
		}
		return prefix.toString();
	}
}
