//pre-increment, post-increment, pre-decrement, post- decrement & Assignment Operator
package com.techlab.assignment.test;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=3, y=5,z=10;
		
		// case1
		int r1 = ++z + y - y + z + x;
		System.out.println("Case 1 result: " + r1);
		
		// case2
		int r2 = ++z + y - y + z + x++; 
		System.out.println("case 2 result : " + r2);
		
		// case 3
		int r3 = ++z + y - y + z + ++x;
		System.out.println("case 3 result : " + r3);
		
		// case 4
		int r4 = ++z + ++y - y + z + ++x;
		System.out.println("case 4 result  : "+ r4);
		
		// case 5 
		int r5 = ++z + ++y - y + z + ++x;
		System.out.println("case 5 result  : "+ r5);
		
		// case 6
		int r6 = ++z + ++y - y++ + z + ++x;
		System.out.println("case 6 result  : "+ r6);
		
		// case 7
			int r7 = --z + y + y-- + z;
			System.out.println("case 7 result  : "+ r7);
			
		// case 7
			int r8 = --z + y + y-- + z + x--;
			System.out.println("case 8 result  : "+ r8);	
	}

}
