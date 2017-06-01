package com.datalex.solutions;

import java.util.HashMap;
import java.util.Map;

public class CardWarGame {

	public static void main(String[] args) {
		String A = "A586QK";
		String B = "JJ653K";
		System.out.println(solution(A, B));
	}

	public static int solution(String A, String B) {
		int numAWins = 0;

		if (A != null && B != null && A.length() == B.length()) {
			Map<String, Integer> deckCards = new HashMap<>();
			for (int i = 2; i <= 9; i++) {
				deckCards.put(String.valueOf(i), i);
			}
			deckCards.put("T", 10);
			deckCards.put("J", 11);
			deckCards.put("Q", 12);
			deckCards.put("K", 13);
			deckCards.put("A", 14);

			for (int i = 0; i < A.length(); i++) {
				Integer aVal = deckCards.get(String.valueOf(A.charAt(i)));
				Integer bVal = deckCards.get(String.valueOf(B.charAt(i)));
				if ((aVal != null && bVal != null)
						&& aVal.intValue() > bVal.intValue()) {
					numAWins++;
				}
			}
		}
		return numAWins;
	}
}
