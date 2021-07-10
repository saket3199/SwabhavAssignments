package com.techlab.assignment;

public class BoxingUnboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boxingAutoboxing();
		unboxingAutounboxing();
	}
	public static void boxingAutoboxing()
	{
		System.out.println("Boxing and AutoBoxing");
		int a=10;
		Integer b= new Integer(a);
		Integer c=a;
		System.out.println("Boxing : "+b);
		System.out.println("Auto Boxing : "+c);
	}
	public static void unboxingAutounboxing()
	{
		System.out.println("UnBoxing and AutoUnBoxing");
		
		Integer b= new Integer(10);
		int a=b.intValue();
		int c=b;
		System.out.println("UnBoxing : "+a);
		System.out.println("Auto UnBoxing : "+c);
	}

	}


