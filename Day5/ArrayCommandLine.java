//create an command line based application to find avearge and sum of nos you are passing through an array
//input:- 12,10,03,04,10,13

package com.techlab.assignment;

public class ArrayCommandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int sum=0;
		 int n = args.length;
		 float avg;
		 for (String num : args) {
				sum = sum + Integer.parseInt(num);
			}
			System.out.println("Sum of Array is : "+sum);
			avg =sum/n;
			
			System.out.println("Average of array is : "+avg);
		}
	}


