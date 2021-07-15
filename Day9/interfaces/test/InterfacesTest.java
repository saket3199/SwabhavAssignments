package com.techlab.interfaces.test;

import com.techlab.interfaces.Address;
import com.techlab.interfaces.Customer;
import com.techlab.interfaces.ICrudable;
import com.techlab.interfaces.Invoice;

public class InterfacesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a = new Address();
		Customer c = new Customer();
		Invoice i = new Invoice();

		printInfo(a);
		
		printInfo(c);
		printInfo(i);
	}

	public static void printInfo(ICrudable c) {
		c.Create();
		c.Delete();
		c.Update();
		c.Read();
	}
	}


