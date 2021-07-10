package com.techlab.circle;

public class Circle3 {
	private float radius;
	private String color;
	private final float START_RADIUS = 1;
	private final float END_RADIUS = 20;
	private final String BLACK = "black";
	private final String BLUE = "blue";
	private final String GREEN = "green";
	private final String YELLOW = "yellow";

	public float getRadius() {
		return radius;
	}

	public String getColor() {
		return color;
	}

	public void setRadius(float newradius) {
		if (newradius >= START_RADIUS && newradius <= END_RADIUS)
			radius = newradius;
		else if (newradius < START_RADIUS)
			radius = START_RADIUS;
		else
			radius = END_RADIUS;

	}

	public void setColor(String newcolor) {
		if (newcolor.equals(BLACK) || newcolor.equals(GREEN) || newcolor.equals(BLUE))
			color = newcolor;
		else
			color = YELLOW;

	}
}
