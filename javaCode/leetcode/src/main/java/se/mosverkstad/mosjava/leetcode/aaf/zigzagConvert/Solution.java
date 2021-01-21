package se.mosverkstad.mosjava.leetcode.aaf.zigzagConvert;

public class Solution {
	public String convert(String str, int numRows) {
		int len = str.length();
		int numInColmn = (2 * numRows - 2);
		if (numInColmn <= 0) return str;
		int numRemains = numInColmn - len % numInColmn;
		int numColumns = (len + numRemains) / numInColmn;
		StringBuilder newStr = new StringBuilder();
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < numColumns; j++) {
				if (i == 0 || i == numRows - 1) {
					appendChar(str, len, newStr, i + numInColmn * j);
				} else {
					appendChar(str, len, newStr, i + numInColmn * j);
					appendChar(str, len, newStr, numInColmn * (j + 1) - i);
				}
			}
		}
		return newStr.toString();
	}
	
	private void appendChar(String str, int len, StringBuilder newStr, int index) {
		if (index > len - 1) return;
		newStr.append(str.charAt(index));
	}
}
