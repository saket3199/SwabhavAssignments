// array based assignment:- create new class ArrayEvenOddTest.java...............create an array [12,04,13,06,15] ...write a logic to segregate even and odd nos and print it on console seperately
package com.techlab.assignment;

public class ArrayEvenOddTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 12, 04, 13, 06, 15 };
		int n = arr.length;
		int oddCount = 0;
		int evenCount = 0;
		int x = 0, y = 0;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				evenCount++;
			} else
				oddCount++;
		}
		int[] evenArray = new int[evenCount];
		int[] oddArray = new int[oddCount];

		for (int i: arr) {
			if (i % 2 == 0) {
				evenArray[x] = i;
				
				x++;
			} else {
				oddArray[y] = i;
				y++;}
		}
		System.out.println("Even Array");
		for(int i:evenArray) {
			System.out.println(i);
		}
		System.out.println("Odd Array");
		for(int i:oddArray) {
			System.out.println(i);
		}
		

	}
}
