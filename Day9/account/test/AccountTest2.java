package com.techlab.account.test;

import com.techlab.account.Account2;
import com.techlab.account.CurrentAccount;
import com.techlab.account.SavingAccount;

public class AccountTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrentAccount ca = new CurrentAccount(10000, "apple", 30000);
		System.out.println("Account No. is " + ca.getAccNo() + " Account Name : " + ca.getAccName() + " Balance : "
				+ ca.getBalance());
		ca.Deposit(2000);
		System.out.println("Current Balance : " + ca.getBalance());
		ca.withDraw(30000);
		printInfo(ca);
		ca.withDraw(1600);
		printInfo(ca);

		SavingAccount sa = new SavingAccount(ca.getAccNo(), ca.getAccName(), ca.getBalance());
		System.out.println("Account No. is " + sa.getAccNo() + " Account Name : " + sa.getAccName() + " Balance : "
				+ sa.getBalance());
		sa.Deposit(2000);
		System.out.println("Current Balance : " + sa.getBalance());
		sa.withDraw(1000);
		printInfo(sa);
		sa.withDraw(2100);
		printInfo(sa);
	}

	private static void printInfo(Account2 a) {
		System.out.println("Account No. is " + a.getAccNo() + " Account Name : " + a.getAccName() + " Balance : "
				+ a.getBalance());
	}
	}


