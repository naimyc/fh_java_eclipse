package com.aufgaben;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentenMain {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Student stud = new Student("El Hajar", "Jwan");
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("stud.txt")); 
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("stud.txt")))
		{
		oos.writeObject(stud);
		Student stud2 = (Student) ois.readObject();
		System.out.println(stud2.getName());
		int s = 0;
		while(true)
		{
			s = System.in.read();
			System.err.println(s);
		}
		}
		catch(ClassNotFoundException cEx)
		{
			System.out.println("Class not found!\n"+cEx);
		}
		catch(FileNotFoundException fileEx)
		{
			System.out.println("File not found: \n"+ fileEx);
		}
		
	}

}
