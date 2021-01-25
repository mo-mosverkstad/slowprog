package se.mosverkstad.mosjava.leetcode.aaq.letterCombiPhone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {
	@SuppressWarnings("serial")
	private final HashMap<Character, List<Character>> phoneLetters = new HashMap<Character, List<Character>>() {
		{
			put('2', new ArrayList<Character>(Arrays.asList('a', 'b', 'c')));
			put('3', new ArrayList<Character>(Arrays.asList('d', 'e', 'f')));
			put('4', new ArrayList<Character>(Arrays.asList('g', 'h', 'i')));
			put('5', new ArrayList<Character>(Arrays.asList('j', 'k', 'l')));
			put('6', new ArrayList<Character>(Arrays.asList('m', 'n', '0')));
			put('7', new ArrayList<Character>(Arrays.asList('p', 'q', 'r', 's')));
			put('8', new ArrayList<Character>(Arrays.asList('t', 'u', 'v')));
			put('9', new ArrayList<Character>(Arrays.asList('w', 'x', 'y', 'z')));
		}
		
	};
	
	public List<String> letterCombinations(String digits) {
		List<String> result = new ArrayList<String>();
        letterCombinationsWithPrefix("", digits, result);
        return result;
    }
	
	private void letterCombinationsWithPrefix(String prefix, String digits, List<String> result) {
		if (digits == null || digits.length() == 0) {
			if (prefix.length() != 0) result.add(prefix);
			return;
		}
        Character digit = digits.charAt(0);
        List<Character> lettersOfDigit = phoneLetters.containsKey(digit)? phoneLetters.get(digit):new ArrayList<Character>();
        for (Character letter : lettersOfDigit) {
        	letterCombinationsWithPrefix(prefix + letter, digits.substring(1), result);
        }
	}
}
