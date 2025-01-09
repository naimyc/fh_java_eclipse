package com.classes;

public class Zoo {
	private String name;
	private Tier[] tiere = new Tier[10];
	private int tierCount = 0;
	
	public Zoo(String name)
	{
		this.name = name;
	}

	public void addTier(Tier t) {
		
		if(tierCount >= tiere.length)
		{
			System.out.println("Maximaler Platzt belegt!");
		}
		else 
		{
			tiere[tierCount] = t;
			tierCount++;
		}
			
	}
	
	public void ausgabe()
	{
		for(int i = 0; i < tierCount; i++)
			tiere[i].ausgabe();
	}
}
