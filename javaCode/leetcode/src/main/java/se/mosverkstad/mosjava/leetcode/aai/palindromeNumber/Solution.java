package se.mosverkstad.mosjava.leetcode.aai.palindromeNumber;

public class Solution {
	
	public boolean isPalindrome(int num) {
		if (num < 0) return false;
		int div = 1;
		while (num / div >= 10) div *= 10;
		return areHeadTailSame(num, div);
	}
	
	private boolean areHeadTailSame(int num, int div) {
		if (num < 10 || div <= 1) return true;
		int head = num / div;
		int tail = num % 10;
		if (tail == head) return areHeadTailSame(removeHeadTail(num, div), div / 100);
		return false;
	}
	
	private int removeHeadTail(int num, int div) {
		return (num % div) / 10; 
	}
}
