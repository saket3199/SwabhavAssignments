package com.techlab.circle.test;

import com.techlab.circle.Circle2;

public class Circle2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle2 s = new Circle2();
		System.out.println("intial value of radius is "+s.getRadius()+" and color is "+s.getColor());
		s.setRadius((float) 3.5);
		s.setColor("black");
		System.out.println("Updated value of radius is "+s.getRadius()+" and color is "+s.getColor());
		s.areaCircle();
		s.perimeterCircle();
	}

}
