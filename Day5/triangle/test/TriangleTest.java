package com.techlab.triangle.test;

import java.util.Scanner;

import com.techlab.triangle.Triangle;

public class TriangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 1 for are and 2 for perimeter");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Triangle triangle = new Triangle();
		if(n==1) {
			triangle.area();
		}
		if(n==2) {
			triangle.perimeter();
		}
		sc.close();
	}

}
