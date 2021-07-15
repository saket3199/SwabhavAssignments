package com.techlab.account;

public class SavingAccount extends Account2 {
	private final double MIN_AMOUNT = 1000;

	public SavingAccount(int accNo, String accName, double balance) {
		super(accNo, accName, balance);

	}

	public void withDraw(double amount) {

		if ((getBalance() - amount) < MIN_AMOUNT) {
			System.err.println("Insufficient Balance ");

		} else {
			setBalance(getBalance() - amount);

		}

	}

}