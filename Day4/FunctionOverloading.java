/* write a program to overload method printlnfo() which will expect different parameter as int, double, float, boolean, string and call it in main
Expected output:- 
Integer value :--10
Double vale:-10.35
String value:- your name 
Char value:- J
Float value:-11.34
Boolean value:- true */
package com.techlab.assignment;

public class FunctionOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		double b=10.35;
		String s="Saket Mishra";
		char c='j';
		float d=(float) 11.34;
		boolean flag=true;
		System.out.println("Integer Value : "+printData(a));
		System.out.println("Double Value : "+printData(b));
		System.out.println("String Value : "+printData(s));
		System.out.println("Char Value : " +printData(c));
		System.out.println("Float Value : "+printData(d));
		System.out.println("Boolean Value : "+printData(flag));
	}
	
	public static int printData(int a)
	{
		return a;
	}
	public static double printData(double a)
	{
		return a;
	}
	public static String printData(String a)
	{
		return a;
	}
	public static char printData(char a)
	{
		return a;
	}
	public static float printData(float a)
	{
		return a;
	}
	public static boolean printData(boolean a)
	{
		return a;
	}

	}


