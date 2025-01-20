package com.sortieren;

import java.util.Iterator;

public class Student {
	private String name;
	private int age;
	private double grade;

	Student[] ss = new Student[10];

	public void init()
	{
		for (int i = 0; i < ss.length; i++) {
			ss[i] = new Student();
			int rAge = (int) (Math.random() * 18 - 12) + 12;
			double rGrade = (Math.random() * 12 - 6) + 6;
			
			ss[i].grade = rGrade;
			ss[i].age = rAge;
		}
	}

	public void sortStudents() {
		for (int i = 0; i < ss.length - 1; i++) {
			double sGrade = ss[i].grade;
			int sAge = ss[i].age;

			Student s1 = ss[i];

			if (sGrade > ss[i + 1].grade) {
				ss[i] = ss[i + 1];
				ss[i + 1] = s1;
			} else if (sGrade == ss[i + 1].grade) {
				if (sAge > ss[i + 1].age) {
					ss[i] = ss[i + 1];
					ss[i + 1] = s1;
				}
			}
		}
	}
	
	public void print()
	{
		for (Student student : ss) {
			System.out.printf("Student age: %d\nStudent Grade: %.2f \n\n", student.age, student.grade);
		}
	}
}
