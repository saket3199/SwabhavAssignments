package com.facade.pattern.test;

import com.facade.pattern.ShapeMaker;

public class FacadeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeMaker shapemaker = new ShapeMaker();
		shapemaker.drawCircle();
		shapemaker.drawRectangle();
		shapemaker.drawSquare();

	}

}
