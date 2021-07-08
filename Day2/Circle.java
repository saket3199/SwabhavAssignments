package com.techlab.assignment;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 1 for Area of the Circle \n,Enter 2 for Perimeter");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		switch (a) {
		case 1:
			System.out.println("Enter the radius : ");
			int r = scanner.nextInt();
			System.out.println(3.142 * r * r);
			break;
		case 2:
			System.out.println("Enter the radius : ");
			int r1 = scanner.nextInt();
			System.out.println(2 * 3.142 * r1);
			break;
		default:
			System.out.println("Enter a Valid selection");
		}

	}

}