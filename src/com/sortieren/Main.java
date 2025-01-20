package com.sortieren;

public class Main {
	public static void main(String[] args) {
		Student s = new Student();
		s.init();
		
		// s.print();
		
		System.err.println("--------------------");
		
		s.sortStudents();
		
		s.print();
	}
}
