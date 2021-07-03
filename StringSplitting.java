// .Write program for following using substring 
// Input:- " https://www.swabhavtech.com@
// java?abc";
// Output:-
// Company name:- swabhav tech
// Lang:- java
// Intern name:- abc( mention your name
// package com.techlab.assignment;

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
