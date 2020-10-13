package com.meritamerica.assignment2;

public class SavingsAccount extends BankAccount{

	
	SavingsAccount(double openingBalance){
		super.balance = openingBalance;
	}
	

	public double getBalance() {
		return super.getBalance();
	}
	
	public double getInterestRate() {
		return super.getInterestRate();
	}
	
	public String toString() {
		return "savings account balance: $" + balance
		+ "\n" + "savings account interst rate: " + interestRate 
		+ "\n" + "savings account balance in 3 years: $" + futureValue(3);
	}
}