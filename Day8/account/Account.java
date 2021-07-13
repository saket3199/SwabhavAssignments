package com.techlab.account;

public class Account {
	private int accNo;
	private String accName;
	private double balance;
	private double MIN_AMMOUNT=500;
	
	public Account(int accNo, String accName, double balance)
	{
		this.accNo=accNo;
		this.accName=accName;
		this.balance=balance;
		
		
	}
	public int getAccNo()
	{
		return accNo;
	}
	public String getAccName()
	{
		return accName;
	}
	public double getBalance()
	{
		return balance;
	}
	public void Deposit(double amount)
	{
		balance+=amount;
	}
	public void withDraw(double amount)
	{
		if(balance-amount<MIN_AMMOUNT)
		{
			System.out.println("Insufficient Balance");
		}
		else
			balance-=amount;
	}

}
