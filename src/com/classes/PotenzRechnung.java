package com.classes;

public class PotenzRechnung {
	int i = 0;
	int a = 0, b = 1;

	public long qhochp(int q, int p) {

		if (p == 0)
			return 1;

		return q * qhochp(q, p - 1);
	}

	public long qhochp_it(int q, int p) {
		long summe = q;
		if (p < 1)
			return 1;
		else
			for (int i = 1; i < p; i++) {
				summe *= q;
			}
		return summe;
	}

	public int fib(int a, int b, int n) {
		if (n == 0) {
			return a; // Wenn wir bei n=0 sind, ist die aktuelle Zahl die gesuchte Fibonacci-Zahl
		}
		return fib(b, a + b, n - 1); // Rekursiver Aufruf mit aktualisierten Werten
	}

}
