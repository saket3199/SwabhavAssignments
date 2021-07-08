//Write a Java program to calculate the average value of array elements [01,11,24,23,15]
package com.techlab.assignment;

public class ArrayAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int myArray[]={01,11,24,23,15};
        int sum=0;
        for(int i: myArray){
            sum+=i;
        }
        System.out.println(sum/myArray.length);
	}

}
