package se.mosverkstad.mosjava.leetcode.aba.removeElement;

public class Solution {
	public int removeElement(int[] nums, int val) {
		if (nums == null || nums.length == 0) return 0;
		int len = nums.length, current = 0, next = 0;
		for (; next < len; next++) {
			if (nums[next] != val) {
				nums[current++] = nums[next];
			}
		}
		return current;
	}
}
