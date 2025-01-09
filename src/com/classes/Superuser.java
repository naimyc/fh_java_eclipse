package com.classes;

public class Superuser extends User {
	
	public Superuser(int id, String name, String username, double money)
	{
		super(id, name, username, money);
	}
	
	public void addMoney(double money)
	{
		double curMoney = getMoney();
		super.setMoney(curMoney + money);
	}
	
	@Override
	public void printData() {
		System.err.printf("Usertype: Superuser\n\nUserId: %d\nName: %s \nUsername: %s \nMoney: %.2f\n\n", super.getId(), super.getName(), super.getName(), super.getMoney());
	}
	
}
