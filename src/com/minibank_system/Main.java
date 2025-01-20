package com.minibank_system;

public class Main {
	public static void main(String[] args) {
		Account s = new SavingsAccount(100, 10);
		Account c = new CheckingAccount(300, 80);
		
		s.deposit(100);
		s.withdraw(120);
		
		System.out.println(s.getBalance());
		System.out.println(c.getBalance());
	}
}
