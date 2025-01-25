package com.intefaces;

public class Interfaces {
	public interface UserData {
		public int getId();
	}

	public interface Zinsen {
		double ZINS1 = 0.3;
		double ZINS2 = 0.4;

		void addZins(int dauer);

	}
}
