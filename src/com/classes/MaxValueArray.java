package com.classes;

import java.util.Iterator;
import java.util.Random;

public class MaxValueArray {
	int[] iArr = new int[10];
	// Random r = new Random();

	void random() {
		int r = (int) (Math.random() * 61 - 5) + 5;
	}

	public void setRandomValues() {

		for (int i = 0; i < iArr.length; i++) {
			iArr[i] = (int) (Math.random() * 100);

		}
	}

	public void getMaxValue() {
		int max = -1;
		for (int i : iArr) {
			if (i > max)
				max = i;
			System.out.println(i);
		}

		System.out.println("Max: " + max);
	}

	public void sort() {

		for (int i : iArr) {
			System.out.println(i);
		}
		// int i = iArr[0];
		int lastIndex = 0;
		for (int j = 0, i = 1; j < iArr.length;) {
			int hilf = iArr[j];
			int hilf2 = iArr[i];

			for (int k = 0; k < lastIndex; k++) {
				if (i < iArr[j]) {
					j++;
				} else {
					iArr[0] = hilf;
					iArr[j] = i;
				}
			}

		}
	}

}
