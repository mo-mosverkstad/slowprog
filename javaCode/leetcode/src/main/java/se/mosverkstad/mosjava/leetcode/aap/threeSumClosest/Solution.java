package se.mosverkstad.mosjava.leetcode.aap.threeSumClosest;

import java.util.Arrays;

public class Solution {
	public int threeSumClosest(int[] nums, int target) {
		if (nums == null || nums.length < 3) return target;
		Arrays.sort(nums);
		int len = nums.length;
		int closest = nums[0] + nums[1] + nums[len - 1];
		int difference = Math.abs(closest - target);
		for (int i = 0; i < len - 2; i ++) {
			int j = i + 1, k = len - 1;
			while (j < k) {
				int sum = nums[i] + nums[j] + nums[k];
				int diff = Math.abs(sum - target);
				if (diff < difference) {
					difference = diff; closest = sum;
					j++;
				} else {
					k--;
				}
			}
		}
		return closest;
	}
}
