package se.mosverkstad.mosjava.leetcode.aah.atoi;

public class Solution {
	
	public int myAtoi(String str) {
		int len = str.length();
		int sign = 1, result = 0;
		int point = 0;
		while (isSpace(str.charAt(point)) && point < len) point++;
		if (isSign(str.charAt(point))) {
			sign = getSign(str.charAt(point));
			point++;
		}
		while (point < len && isInt(str.charAt(point))) {
			if (result <= Integer.MAX_VALUE / 10) {
				result = result * 10 + getInt(str.charAt(point));
				point++;
			} else {
				return sign == 1? Integer.MAX_VALUE : Integer.MIN_VALUE;
			}
		}
		
		return result * sign;
	}
	
	private boolean isSpace(char ch) {
		return (ch == ' ')? true : false;
	}
	
	private boolean isSign(char ch) {
		return (ch == '+' || ch == '-')? true : false;
	}
	
	private int getSign(char ch) {
		return ch == '-'? -1 : 1;
	}
	
	private boolean isInt(char ch) {
		return (ch >= '0' && ch <= '9')? true : false;
	}
	
	private int getInt(char ch) {
		return ch - '0';
	}
}
