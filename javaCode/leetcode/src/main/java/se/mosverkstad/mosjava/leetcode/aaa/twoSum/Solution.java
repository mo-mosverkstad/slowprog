package se.mosverkstad.mosjava.leetcode.aaa.twoSum;

import java.util.HashMap;

public class Solution {
	public Integer[] twoSum(Integer[] nums, Integer target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		Integer[] results = new Integer[2]; 
		for (int i = 0; i < nums.length; i++) {
			Integer difference = target - nums[i];
			if (map.containsKey(difference)) {
				results[0] = map.get(difference);
				results[1] = i;
			}
			map.put(nums[i], i);
		}
		return results;
	}
}
