package se.mosverkstad.mosjava.leetcode.abd.substringConcatenationWords;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<Integer> findSubstring(String s, String[] words) {
		int wordLen = words[0].length();
		int wordsLen = wordLen * words.length;
		WordSet set = new WordSet(words);
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 0, len = s.length(); i <= len - wordsLen; i ++) {
			if (set.isSet(s.substring(i, i + wordsLen), wordLen)) result.add(i);
			set.cleanup();
		}
		return result;
	}
}