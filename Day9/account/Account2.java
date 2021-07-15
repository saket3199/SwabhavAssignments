package com.techlab.account;

public class Account2 {

		private int accNo;
		private String accName;
		private double balance;
		private double MIN_AMMOUNT=500;
		
		public Account2(int accNo, String accName, double balance)
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
		public void setBalance(double rBalance) {
			balance = rBalance;
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
