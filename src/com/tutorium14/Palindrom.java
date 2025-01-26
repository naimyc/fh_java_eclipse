package com.tutorium14;

public class Palindrom {
	public int isPalindrom(char[] wordArray, int indexA) throws LeererStringException {

		char charA = wordArray[wordArray.length - indexA - 1];
		char charB = wordArray[indexA];

		System.out.println(charA + ", " + charB);

		if (indexA == (wordArray.length / 2))
			if (charA == charB)
				return 1;
			else
				return 0;

		return 1 * isPalindrom(wordArray, indexA - 1);
	}
}
