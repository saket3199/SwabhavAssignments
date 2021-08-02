package com.facade.pattern;

public class ShapeMaker {
	private Shape Rectangle;
	private Shape Square;
	private Shape Circle;
	
	public ShapeMaker() {
		Circle = new Circle();
		Square = new Square();
		Rectangle = new Rectangle();
	}

	public void drawCircle() {
		Circle.draw();
	}
	public void drawRectangle() {
		Rectangle.draw();
	}
	public void drawSquare() {
		Square.draw();
	}
}
