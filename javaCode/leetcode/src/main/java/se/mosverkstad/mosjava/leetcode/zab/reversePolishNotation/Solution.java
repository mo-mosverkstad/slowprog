package se.mosverkstad.mosjava.leetcode.zab.reversePolishNotation;

import java.util.Stack;

public class Solution {	
	public String rpn(String expression) {
		Stack<Character> operatorStack = new Stack<Character>();
		StringBuilder output = new StringBuilder();
		
		for (char ch : expression.toCharArray()) {
			if (Operator.isOperator(ch)) {
				if ((operatorStack.size() > 0 && Operator.compare(ch, operatorStack.peek()) < 0 && operatorStack.peek() != '(')
						|| (operatorStack.size() > 0 && operatorStack.peek() == '(')
						|| (operatorStack.size() == 0)) {
					operatorStack.push(ch);
				} else {
					char prevOp = operatorStack.pop();
					while(operatorStack.size() > 0 && prevOp != '(') {
						output.append(prevOp);
						prevOp = operatorStack.pop();
					}
					if (operatorStack.isEmpty()) output.append(prevOp);
					if (ch != ')') operatorStack.push(ch);
				}
			} else {
				output.append(ch);
			}
		}
		while (!operatorStack.isEmpty()) output.append(operatorStack.pop());
		System.out.println(output.toString());
		return output.toString();
	}
}
