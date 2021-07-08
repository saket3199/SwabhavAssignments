//4.swap two no's without using third variable ...do it using function
package com.techlab.assignment;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=234,b=678;
		System.out.println("Values of a ,b before swapping is "+a+" "+b);
		swapNumbers(a,b);

	}

	private static void swapNumbers(int a, int b) {
		// TODO Auto-generated method stub
		a=a+b;    
		b=a-b;    
		a=a-b;
		System.out.println("Values of a ,b after swapping is "+a+" "+b);
		
		
	}

}
