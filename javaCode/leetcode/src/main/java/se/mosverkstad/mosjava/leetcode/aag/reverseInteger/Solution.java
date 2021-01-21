package se.mosverkstad.mosjava.leetcode.aag.reverseInteger;

public class Solution {
	public int reverse(int x) {
		int result = 0;
		while (x != 0) {
			if (Math.abs(x) > Integer.MAX_VALUE) return 0;
			result = result * 10 + x % 10;
			x = x / 10;
		}
		return result;
	}
}
