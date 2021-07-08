//1. Program to find palindrome number using function ...create one function outside main...write your logic der and call it inside main 
package com.techlab.assignment;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a Number: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		palindrome(n);

	}

	private static void palindrome(int n) {
		// TODO Auto-generated method stub
		int temp=n,r,sum=0; 
		  while(n>0){    
		   r=n%10; 
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  
		
	}


