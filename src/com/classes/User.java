package com.classes;
import com.intefaces.Interfaces.UserData;

public class User implements UserData{
	
	private int id = -1;
	private String name = null;
	private String username = null;
	private double money = 0;
	
	public User(int id, String name, String username, double money) {
		super();
		this.id = id; 
		this.name = name;
		this.username = username;
		this.money = money;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}	
	public int getId() 
	{
		return this.id;
	}
	
	public void printData() {
		System.out.printf("Usertype: Default user\n\nUserId: %d\nName: %s \nUsername: %s \nMoney: %.2f\n\n", id, name, username, money);
	}
	
}