package se.mosverkstad.mosjava.leetcode.aaz.removeDuplicatesSortedArray;

public class Solution {
	public int removeDuplicates(int[] nums) {
		if (nums == null || nums.length == 0) return 0;
		int len = nums.length, current = 0, next = 0;
		for (; next < len; ) {
			if (nums[current] == nums[next]) next++;
			else nums[++current] = nums[next];
		}
		return current + 1;
	}
}
