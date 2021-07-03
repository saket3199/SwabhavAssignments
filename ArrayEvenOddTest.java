// array based assignment:- create new class ArrayEvenOddTest.java...............create an array [12,04,13,06,15] ...write a logic to segregate even and odd nos and print it on console seperately

package com.techlab.assignment;
public class ArrayEvenOddTest
{
	public static void main(String[] args) {
	    int myArray[]={12,04,13,06,15};
	    int size = myArray.length;
	    int[] evenArray = new int[(size/2)+1];
	    int[] oddArray=new int[(size/2)+1];
	    int even=0;
	    int odd=0;
	    for (int i: myArray){
	        
	        if (i%2==0){
	            evenArray[even]=i;
	            even++;
	        }
	        else{
	            oddArray[odd]=i;
	            odd++;
	        }
	        
	    } 
	    System.out.println("Elements in evenArray are: ");
	    for(int j:evenArray){
	        
	        System.out.println(j);
	    }
	    System.out.println("Elements in oddArray are: ");
	    for(int j:oddArray){
	        
	        System.out.println(j);
	    }
	}
}
