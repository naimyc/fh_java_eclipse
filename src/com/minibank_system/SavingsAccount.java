package com.minibank_system;
/**
 * {@summary} Begrenztes Account
 */
public class SavingsAccount extends Account {
	
	public SavingsAccount(double accountNumber, double balance) {
		super(accountNumber, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		
		if(amount > 100)
			super.withdraw(amount);
		else 
			System.out.println("Amount muss größer als 100 sein!");
	}
	
	
}
