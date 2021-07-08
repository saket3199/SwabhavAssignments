package com.techlab.assignment;
import java.util.Scanner;
public class armStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter a Number : ");
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		int copy = n, temp = 0;
		while (n != 0) {
			int a = n % 10;
			temp += a * a * a;
			n = n / 10;

		}
		if (copy == temp) {
			System.out.println("It is an Armstrong Number : "+copy);
		}
		else
			System.out.println("It is not an Armstrong Number : "+copy);
	}

}
