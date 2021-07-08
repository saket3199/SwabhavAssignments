//2. Write a program to count no occurence in array using method 
//Suppose array :-[2 5 4 2 7 4 2]
//Output:- 
//2 is repeating thrice ,4 twice and others once 

package com.techlab.assignment;

public class OccurencesOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {2 ,5 ,4 ,2 ,7 ,4 ,2};
		int arr[]= new int[11];
		for(int i=0;i<num.length;i++) {
			arr[num[i]]++;
		}
		for(int i=1;i<=10;i++) {
			if(arr[i]>1) {
				System.out.println(i+" occurs " +arr[i]+" times");	
			}	
		}
		System.out.println("Rest all occurs only Once");

	}

}
