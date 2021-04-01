package se.mosverkstad.mosjava.leetcode.abf.longestValidParentheses;

import java.util.Stack;

public class Solution {
	public int longestValidParentheses(String s) {
		Stack<Character> stack = new Stack<Character>();
		int count = 0, maxCount = 0;
		for (int i = 0, len = s.length(); i < len; i++) {
			if (s.charAt(i) == '(') stack.push(s.charAt(i));
			if (s.charAt(i) == ')') {
				if (stack.isEmpty()) {
					maxCount = count > maxCount? count: maxCount;
					count = 0;
				}
				else {
					stack.pop();
					count += 2;
				}
			}
		}
		return count > maxCount? count: maxCount;
	}
}
