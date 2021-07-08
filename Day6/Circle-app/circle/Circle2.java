package com.techlab.circle;

public class Circle2 {
	
	private float radius;
	private String color = "yellow";

	public float getRadius() {
		return radius;
	}

	public String getColor() {
		return color;
	}

	public void setRadius(float newRadius) {
		if (newRadius >0  && newRadius < 21)
			radius = newRadius;
		else {
			System.out.println("Radius Should be in range of 1 to 20");
			radius = 0;
		}
	}

	public void setColor(String newColor) {
		if (newColor == "black" || newColor == "blue" || newColor == "green")
			color = newColor;
		else
			color = "yellow";

	}

	public void areaCircle() {
		System.out.println("Area of circle is : " + (3.142 * radius * radius));
	}

	public void perimeterCircle() {
		System.out.println("Perimeter of the circle is "+(2 * 3.142 * radius));
	}

}
