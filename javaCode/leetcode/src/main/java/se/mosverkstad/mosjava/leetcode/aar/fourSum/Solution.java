package se.mosverkstad.mosjava.leetcode.aar.fourSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) return new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int len = nums.length;
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        for (int i = 0; i < len - 3; i++) {
        	for (int j = i + 1; j < len - 2; j++) {
        		if (j > 1 && nums[j - 1] == nums[j]) continue;
        		int k = j + 1, l = len - 1;
        		int diff = target - nums[i] - nums[j];
        		while (k < l) {
        			int sum = nums[k] + nums[l];
        			if (sum == diff) {
        				result.add(new ArrayList<Integer>(Arrays.asList(nums[i], nums[j], nums[k], nums[l])));
        				break;
        			}
        			if (sum > diff) l--;
        			else k++;
        		}
        	}
        }
        return result;
    }
}
