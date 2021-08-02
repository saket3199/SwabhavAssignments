package com.decorator.pattern.test;

import com.decorator.pattern.Circle;
import com.decorator.pattern.Rectangle;
import com.decorator.pattern.RedShapeDecorator;
import com.decorator.pattern.Shape;

public class DecoratorPatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape circle = new Circle();

	      Shape redCircle = new RedShapeDecorator(new Circle());

	      Shape redRectangle = new RedShapeDecorator(new Rectangle());
	      System.out.println("Circle with normal border");
	      circle.draw();

	      System.out.println("\nCircle of red border");
	      redCircle.draw();

	      System.out.println("\nRectangle of red border");
	      redRectangle.draw();

	}

}
