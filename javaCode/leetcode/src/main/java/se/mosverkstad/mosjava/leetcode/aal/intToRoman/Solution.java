package se.mosverkstad.mosjava.leetcode.aal.intToRoman;

public class Solution {
	class Base {
		int number;
		String letter;
		Base(int number, String letter) {
			this.number = number;
			this.letter = letter;
		}
	}
	private Base[] tenBase = new Base[]{new Base(1000, "M"), new Base(100, "C"), new Base(10, "X"), new Base(1, "I")};
	private Base[] fivBase = new Base[]{new Base(5000, ""), new Base(500, "D"), new Base(50, "L"), new Base(5, "V")};
	
	public String intToRoman(int num) {
		if (num > 3999 || num <= 0) return "";
		
		StringBuilder str = new StringBuilder();
		int basePoint = 0;
		while (num > 0) {
			int numInBase = num / tenBase[basePoint].number;
			if (numInBase > 0 && numInBase < 4) for (int i = 0; i < numInBase; i++) str.append(tenBase[basePoint].letter);
			if (numInBase == 4) str.append(tenBase[basePoint].letter).append(fivBase[basePoint].letter);
			if (numInBase > 4 && numInBase < 9) {
				str.append(fivBase[basePoint].letter);
				for (int i = 0; i < numInBase % 5; i++) str.append(tenBase[basePoint].letter);
			}
			if (numInBase == 9) str.append(tenBase[basePoint].letter).append(tenBase[basePoint - 1].letter);
			num = num % tenBase[basePoint].number;
			basePoint++;
			
		}
		return str.toString();
	}
}
