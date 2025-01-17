package com.main;

import com.classes.Auto;
import com.classes.AutoReifenSatz;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException{
		
		AutoReifenSatz r = new AutoReifenSatz("SommerReifen", 4);
		Auto a = new Auto("VW", r);
		

		Auto aKopie = a.clone();
		aKopie.setAutoTyp("BMW");
		
		aKopie.getReifen().setTyp("WinterReifen");
		
		System.out.println(a.toString());
		System.out.println(aKopie.toString());
		System.out.println(a.toString());


	}
}
