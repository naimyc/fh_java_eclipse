package com.minibank_system;

public abstract class Account {
	private double accountNumber, balance;
	
	public void deposit(double amount) {
		balance += amount;
	}
	public void withdraw(double amount)
	{
		balance -= amount;
	}
	
	public double getBalance() {
		return balance;
	}
	/**
	 * @param accountNumber
	 * @param balance
	 */
	public Account(double accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
}
