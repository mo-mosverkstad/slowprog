package se.mosverkstad.mosjava.leetcode.abc.divideTwoIntegers;

public class Solution {
	public int divide(int dividend, int divisor) {
		if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
		if (dividend == 0 || divisor == 0) return 0;
		int m = Math.abs(dividend), n = Math.abs(divisor);
		int sign = ((dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0))? 1 : -1;
		int result = 0;
		while (m >= n) {
			int t = n, p = 1;
			while (m >= (t << 1)) {
				t = t << 1;
				p = p << 1;
			}
			result += p;
			m = m - t;
		}
		return sign == 1? result : -result;
	}
}
