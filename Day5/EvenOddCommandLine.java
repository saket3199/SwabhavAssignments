//Write a program to passing some value 12,03,45,67,24 through command Line and you have to find the even and odd Number 

package com.techlab.assignment;

public class EvenOddCommandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n = args.length;
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

		for (String i: args) {
			if (Integer.parseInt(i) % 2 == 0) {
				evenArray[x] = Integer.parseInt(i);
				
				x++;
			} else {
				oddArray[y] = Integer.parseInt(i);
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
