package se.mosverkstad.mosjava.leetcode.aav.generateParentheses;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<String> generateParenthesis(int n) {
		List<String> result = new ArrayList<String>();
		generateNextParentheses(n, n, "", result);
		return result;
	}
	
	private void generateNextParentheses(int left, int right, String str, List<String> result) {
		if (left == 0) {
			String end = "";
			for (int i = 0; i < right; i++) end += ")";
			result.add(str + end);
			return;
		}
		if (left == right) {
			generateNextParentheses(left - 1, right, str + "(", result);
		}
		else {
			generateNextParentheses(left - 1, right, str + "(", result);
			generateNextParentheses(left, right - 1, str + ")", result);
		}
	}
}
