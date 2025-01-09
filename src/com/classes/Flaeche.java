package com.classes;

public abstract class Flaeche {
	private String typ = "Flaeche";
	
	public void setTyp(String typ) {
		this.typ = typ;
	}

	public String getTyp()
	{
		return typ;
	}
	
	abstract public int getUmfang();
	}
