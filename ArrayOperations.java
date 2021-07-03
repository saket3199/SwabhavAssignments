//Write a Java program to find the largest and second largest value of an array.[10,56,78,100,34,57]
package com.techlab.assignment;

public class ArrayOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int myArray[]={10,56,78,100,34,57};
    int temp;
    for(int i=0;i<myArray.length;i++){
        for(int j=i+1;j<myArray.length;j++){
             if(myArray[i] < myArray[j]) {    
                   temp = myArray[i];    
                   myArray[i] = myArray[j];    
                   myArray[j] = temp;    
             }
        }
    }
    System.out.println(myArray[0]);
    System.out.println(myArray[1]);
	}

}
