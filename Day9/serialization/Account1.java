package com.techlab.account;

import java.io.Serializable;

public class Account1 implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accName=" + accName + ", balance=" + balance + ", transactionStatus="
				+ transactionStatus + "]";
	}

	private boolean transactionStatus = true;
	private int accNo;
	private String accName;
	private double balance;
	private double MIN_AMMOUNT = 500;

	public Account1(int accNo, String accName, double balance) {
		this.accNo = accNo;
		this.accName = accName;
		this.balance = balance;

	}

	public int getAccNo() {
		return accNo;
	}

	public String getAccName() {
		return accName;
	}

	public double getBalance() {
		return balance;
	}
	public boolean getTransactionStatus() {
		return transactionStatus;
	}

	public void Deposit(double amount) {
		balance += amount;
	}

	public void withDraw(double amount) {
		if (balance - amount < MIN_AMMOUNT) {
			System.out.println("Insufficient Balance");
			transactionStatus = false;
		} else
			balance -= amount;
		transactionStatus = true;
	}

}
