package edu.datastructures;

public class DynamicStringArray {
	private int counter = 0, length = 10;
	private String[] array = new String[length];
	
	public static void main(String[] args) {
		DynamicStringArray dsa = new DynamicStringArray();
		
		char[] letters = "abcdefghijklmno".toCharArray();
		for (int i = 0; i < letters.length; i++) {
			dsa.add(letters[i]+"");
		}
		
		dsa.printAllItems();
		
		
		System.err.println("----------------------------------------");
		dsa.removeAt(3);
		
		dsa.printAllItems();
		
	}

	private int getCount() {
		return counter;
	}

	private int getLength() {
		return length;
	}

	public boolean contains(String s) {
		for (String ss : array) 
			if (s.toLowerCase().equals(ss.toLowerCase()))
				return true;
		return false;
	}

	public String get(int index) throws IndexOutOfBoundsException{
		if(index > getCount())
			throw new IndexOutOfBoundsException();
		return array[index];
	}

	public void removeAt(int index) throws IndexOutOfBoundsException{
		
		if(index > getCount())
			throw new IndexOutOfBoundsException();
		
		index -= 1;
		array[index] = null;
		for(int i = index; i < getCount(); i++)
		{
			String value_0 = array[i+1];
			array[i+1] = array[i];
			array[i] = value_0;
		}
			

	}
	
	public void printAllItems() {
		for (String string : array) {
			System.out.println(string);
		}
	}

	public void add(String s) {
		if (getCount() < getLength()-1) {
			array[counter] = s;
			counter++;
		} else {

			length *= 2;
			String[] newArray = new String[length];

			for (int i = 0; i < length / 2; i++) {
				newArray[i] = array[i];
			}
			array = newArray;
			array[counter] = s;
			counter++;
		}
	}

}
