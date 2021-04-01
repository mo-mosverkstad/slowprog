package se.mosverkstad.mosjava.leetcode.abe.nextPermutation;

import java.util.LinkedList;

public class Solution {
	
	public void nextPermutation(int[] nums) {
		int i, j, len = nums.length;
		for (i = len - 1; i > 0 && nums[i - 1] > nums[i]; i--);
		if (i == 0) {
			reverseInArray(nums, 0, len - 1);
			return;
		}
		int anchorSmall = i - 1;
		for (j = i; j < len && nums[anchorSmall] < nums[j]; j++);
		int anchorBig = j - 1;
		swapInArray(nums, anchorSmall, anchorBig);
		reverseInArray(nums, anchorSmall + 1, len - 1);
	}
	
	private void swapInArray(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	
	private void reverseInArray(int[] nums, int begin, int end) {
		int len = (end - begin + 1) / 2;
		for (int i = 0; i < len; i++) swapInArray(nums, begin + i, end - i);
	}
		
}
