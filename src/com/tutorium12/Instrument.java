package com.tutorium12;

public abstract class Instrument {
	abstract void play();
	
	void tune()
	{
		System.out.println("Das Instrument wird gestimmt.");
	}
}
