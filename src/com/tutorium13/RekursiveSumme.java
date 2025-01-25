package com.tutorium13;

public class RekursiveSumme {
	public long summe(long n) {
		
		if(n < 0)
			throw new IllegalArgumentException("Zahl muss größer sein als 0");
		
		if (n == 1)
			return 1;

		if (n == 0)
			return 0;
		else
			return n + summe(n - 1);
	}
	
	public int summeArray(int[] arr, int sum, int n) {
		
		if(n == 0)
			return 0;
		
		int value = arr[n - 1];
		
		return value + summeArray(arr, sum + value, n - 1);
	}
}
