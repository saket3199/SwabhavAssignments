package com.techlab.account;

public class CurrentAccount extends Account2 {
	private final double MIN_AMOUNT = 500;

	public CurrentAccount(int accNo, String accName, double balance) {
		super(accNo, accName, balance);

	}

	@Override
	public void withDraw(double amount) {

		if ((getBalance() - amount) < MIN_AMOUNT) {
			System.out.println("Insufficient Balance");

		} else {
			setBalance(getBalance() - amount);

		}

	}

}
