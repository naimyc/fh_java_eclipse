package com.sortieren;

import com.classes.PotenzRechnung;

public class Main {
	public static void main(String[] args) {
		Student s = new Student();
		s.init();
		s.sortStudents();
		s.print();
	}
}
