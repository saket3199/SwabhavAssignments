package com.techlab.colectionApp.test;

import java.util.ArrayList;

import com.techlab.colectionApp.LineItem;

public class LineItemTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<LineItem> cart = new ArrayList<LineItem>();
		cart.add(new LineItem(101, "Apple", 230, 10));
		cart.add(new LineItem(102, "Mango", 50, 5));
		cart.add(new LineItem(103, "Grapes", 85, 2));
		printCartItem(cart);
	}

	public static void printCartItem(ArrayList<LineItem> cart) {
		for (int i = 0; i < cart.size(); i++) {
			System.out.println("Id " + cart.get(i).getId() + " Name " + cart.get(i).getName() + " UnitPrice "
					+ cart.get(i).getUnitPrice() + " Quantity " + cart.get(i).getQuantity() + " TotalPrice "
					+ cart.get(i).calculateTotalCartPrice());
			// System.out.println(cart.get(i).toString());

		}

	}

}
