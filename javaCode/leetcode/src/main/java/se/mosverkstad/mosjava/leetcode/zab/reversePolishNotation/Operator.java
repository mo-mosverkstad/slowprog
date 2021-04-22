package se.mosverkstad.mosjava.leetcode.zab.reversePolishNotation;

public enum Operator {
	LEFT_BRACKET('(', 1), RIGHT_BRACKET(')', 100),
    MULTIPLY('*', 3), DIVIDE('/', 3), LEFTOVER('%', 3),
    ADD('+', 4), SUBTRACT('-', 4);
    
	
	char opValue;
    int priority;

    Operator(char opValue, int priority) {
        this.opValue = opValue;
        this.priority = priority;
    }
    
    public static int compare(char opValue1, char opValue2) {
    	return getPriority(opValue1) - getPriority(opValue2);
    }
    
    public static boolean isOperator(char opValue) {
    	return getPriority(opValue) > 0;
    }
    
    public static int getPriority (char opValue) {
    	for (Operator op : Operator.values()) {
    		if (op.opValue == opValue) return op.priority;
    	}
    	return -1;
    }
}
