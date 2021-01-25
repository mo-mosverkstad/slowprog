package se.mosverkstad.mosjava.leetcode.aat.validParentheses;

import java.util.Stack;

public class Solution {
	private final char CIRCLE_LEFT  = '(';
	private final char CIRCLE_RIGHT = ')';
	private final char SQUARE_LEFT  = '[';
	private final char SQUARE_RIGHT = ']';
	private final char CURLY_LEFT   = '{';
	private final char CURLY_RIGHT  = '}';
	
	public boolean isValid(String s) {
		Stack<Character> parenthesesStack = new Stack<Character>();
		for (int i = 0, len = s.length(); i < len; i++) {
			char currentChar = s.charAt(i);
			if ( currentChar == CIRCLE_LEFT || currentChar == SQUARE_LEFT || currentChar == CURLY_LEFT) {
				parenthesesStack.push(currentChar);
			} else {
				if (parenthesesStack.empty()) return false;
				if (currentChar == CIRCLE_RIGHT && parenthesesStack.pop() != CIRCLE_LEFT) return false;
				if (currentChar == SQUARE_RIGHT && parenthesesStack.pop() != SQUARE_LEFT) return false;
				if (currentChar == CURLY_RIGHT  && parenthesesStack.pop() != CURLY_LEFT)  return false;
			}
		}
		
        return parenthesesStack.empty();
    }
}
