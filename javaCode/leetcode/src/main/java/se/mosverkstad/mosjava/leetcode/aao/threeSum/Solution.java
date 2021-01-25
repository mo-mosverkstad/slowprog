package se.mosverkstad.mosjava.leetcode.aao.threeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public List<List<Integer>> threeSum(int[] nums) {
		if (nums == null || nums.length < 3) return new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		int len = nums.length;
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		for (int i = 0; i < len - 2; i++) {
			if (nums[i] > 0) break; // impossible to add three positive int because of sorted array. 
			if (i > 0 && nums[i - 1] == nums[i]) continue; //remove duplicates.
			int difference = 0 - nums[i], j = i + 1, k = len - 1;
			while (j < k) {
				int sum = nums[j] + nums[k];
				if (sum == difference) result.add(new ArrayList<Integer>(Arrays.asList(nums[i], nums[j], nums[k])));
				if (sum > difference) k--;
				else j++;
			}
		}
		return result;
	}
}
