package com.aufgaben;

import java.io.Serializable;

public class Student implements Serializable{
	private String name, vorname;

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getVorname() {
		return vorname;
	}


	public void setVorname(String vorname) {
		this.vorname = vorname;
	}


	/**
	 * @param name
	 * @param vorname
	 */
	public Student(String name, String vorname) {
		this.name = name;
		this.vorname = vorname;
	}
	
	
}
