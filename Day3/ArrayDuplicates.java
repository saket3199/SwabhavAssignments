package com.techlab.assignment;

public class ArrayDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int myArray[]={10,56,78,100,78,57,01,10};
        int count=0;
        for (int i=0;i<myArray.length ;i++ ){
            for(int j=i+1;j<myArray.length;j++){
                if (myArray[i]==myArray[j]){
                    count++;
                } 
            }
        } 
        System.out.println(count);
	}

}