// Write a program to find all prime numbers upto 100
package com.techlab.assignment;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 2; i < 100; i++) {
			boolean flag = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}

			}
			if (flag) {
				System.out.println(i);

			}

		}
	}

}
