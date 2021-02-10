package se.mosverkstad.mosjava.leetcode.abd.substringConcatenationWords;

import java.util.HashMap;
import java.util.Map;

public class WordSet {
	private Map<String, Integer> wordMap = new HashMap<String, Integer>();
	private Map<String, Integer> testMap = new HashMap<String, Integer>();
	private String REGEX_SPLIT_STRING = "(?<=\\G.{%d})";
	
	public WordSet(String[] words) {
		add(wordMap, words);
	}
	
	private void add(Map<String, Integer> map, String[] words) {
		for (String word : words) {
			if (map.containsKey(word)) map.put(word, map.get(word) + 1);
			else map.put(word, 1);
		}
	}
	
	public void cleanup() {
		testMap.clear();
	}
	
	public boolean isSet(String sentence, int len) {
		add(testMap, sentence.split(String.format(REGEX_SPLIT_STRING, len)));
		return wordMap.equals(testMap);
	}
}
