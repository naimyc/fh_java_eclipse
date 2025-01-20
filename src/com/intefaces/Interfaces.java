package com.intefaces;

public class Interfaces {
	public interface UserData {
		public int getId();
	}

	public interface Zinsen {
		public final double ZINS1 = 0.3;
		public final double ZINS2 = 0.4;

		public void addZins(int dauer);

	}
}
