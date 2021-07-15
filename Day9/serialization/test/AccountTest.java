package com.techlab.account.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


import com.techlab.account.Account1;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account1 a = new Account1(1, "Apple", 50000.0);
		System.out.println(
				"accountNo = " + a.getAccNo() + " accountName = " + a.getAccName() + " balance = " + a.getBalance());
		a.Deposit(100);
		System.out.println("balance = " + a.getBalance());
		a.withDraw(2000);
		printInfo(a);
		a.withDraw(3000);
		printInfo(a);

		Account1 b = new Account1(2, "zebra", 30000.0);
		System.out.println(
				"accountNo = " + b.getAccNo() + " accountName = " + b.getAccName() + " balance = " + b.getBalance());
		b.Deposit(2000);
		System.out.println("balance = " + b.getBalance());
		b.withDraw(4000);
		printInfo(b);
		b.withDraw(3000);
		printInfo(a);
		b.withDraw(1000);
		printInfo(a);
		a.withDraw(500);
		printInfo(a);
		storingAccountDetails(a);
		retriveAccountDetails(a);
	}

	public static void printInfo(Account1 a) {
		System.out.println("\n Transtion done by  " + a.getAccName());

		if (!a.getTransactionStatus()) {
			System.err.println("Insufficient Balance  ");
			System.out.println("Current Balance : " + a.getBalance());
		} else {
			System.out.println("Current Balance : " + a.getBalance());
		}

	}

	private static void storingAccountDetails(Account1 a) {
		try {
			FileOutputStream fout = new FileOutputStream(
					"C:\\Users\\saket\\eclipse-workspace\\assignment\\src\\com\\techlab\\account\\AccountDetails.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(a);
			out.flush();
			out.close();
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	private static Account1 retriveAccountDetails(Account1 retriveAccount) {
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(
					"C:\\Users\\saket\\eclipse-workspace\\assignment\\src\\com\\techlab\\account\\AccountDetails.txt"));
			retriveAccount = (Account1) in.readObject();
			System.out.println(retriveAccount.toString());
			in.close();
		} catch (Exception e) {
			System.err.println(e);
		}
		return retriveAccount;
	}

}
