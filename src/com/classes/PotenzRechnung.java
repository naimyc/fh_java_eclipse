package com.classes;

public class PotenzRechnung {
	public int qhochp(int q, int p)
	{
		int i = 1;
		int summe = q;
		
		while(i < p)
		{
			summe *= q;
			i++;
		}
		return summe;
	}
}
