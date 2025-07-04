package edu.data_structures;

import java.util.Iterator;

public class DynamicString {
	int count = 0, length = 10;
	String[] strArr;

	public static void main(String[] args) {
		DynamicString s = new DynamicString();

		s.add("Hello");
		s.add("Bai");
		s.add("Hello");
		s.add("Hello");

		s.removeAt(1);
		s.removeAt(0);
		s.printAllItems();
	}

	public DynamicString() {
		strArr = new String[length];
	}

	void add(String s) {
		if (getCount() >= getLength()) {
			length *= 2;
			String[] newStr = new String[length];
			for (int i = 0; i < strArr.length; i++) {
				newStr[i] = strArr[i];
			}
			strArr = newStr;
			count++;
		} else {
			strArr[count] = s;
			count++;
		}
	}

	int getCount() {
		return count;
	}

	int getLength() {
		return length;
	}

	String get(int index) {
		if (index < 0 || index > length)
			throw new IndexOutOfBoundsException();

		return strArr[index];
	}

	void removeAt(int index) {
		strArr[index] = null;
		for (int i = index; i < count; i++) {
			String oldStr = strArr[index + 1];

			strArr[index] = oldStr;
		}
	}

	boolean contains(String s) {
		for (String string : strArr) {
			if (string.equals(s))
				return true;
		}
		return false;
	}

	void printAllItems() {
		for (String string : strArr) {
			System.out.println(string);
		}
	}

}
