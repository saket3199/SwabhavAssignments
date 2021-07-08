//now i want to you try one program on it ....create new class name it as EvenOddFunctionTest.java ....in dat you have to create one method outside main() name is as printEvenOddNumber()....write your logic of calculating even and odd in dat and just call dat method inside main

package com.techlab.assignment;
import java.util.Scanner;
public class EvenOddFunctionTest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a Number");
		Scanner scanner = new Scanner(System.in);
		int n =scanner.nextInt();
		evenoddchecker(n);
		scanner.close();
	}

	private static void evenoddchecker(int n) {
		// TODO Auto-generated method stub
		if(n%2==0) {
			System.out.println(n+" is Even Number");
		}
		else {
			System.out.println(n+" is Odd Number");
		}
	}

}
