package com.techlab.assignment;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Base and Exponent");
		int base = sc.nextInt();
		int exponent = sc.nextInt();
		int power = 1;
		if (exponent == 0)
			System.out.println("1");
		else if(b>0){
			for (int i = 1; i <= exponent; i++)   {  
            power = power * base;    
        }
    }  
			System.out.println("Power of number is : "+power);
		}
    }
		