package com.techlab.triangle;

public class Triangle {
	public float side1=20;
	public float side2=20;
	public float side3=20;

	
	public void area(){
		double s=((double)(side1+side2+side3)/2);
		System.out.println("Area of Traingle is "+(Math.sqrt(s*(s-side1)*(s-side2)*(s-side3))));
		
	}
	public void perimeter() {
		System.out.println("Perimeter of triangle is"+(side1+side2+side3));
	}
}
