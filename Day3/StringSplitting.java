package com.techlab.assignment;

public class StringSplitting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String stringText = "https://www.swabhavtech.com@java?Saket";
    String [] str = stringText.split("[@?]");
    for (int i=0;i<str.length ;i++ ){
        System.out.println(str[i]);
    } 
	}

}