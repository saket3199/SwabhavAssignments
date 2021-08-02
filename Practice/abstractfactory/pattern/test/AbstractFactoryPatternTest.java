package com.abstractfactory.pattern.test;

import com.abstractfactory.pattern.AbstractFactory;
import com.abstractfactory.pattern.FactoryProducer;
import com.abstractfactory.pattern.Shape;

public class AbstractFactoryPatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//get shape factory
	      AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
	      //get an object of Shape Rectangle
	      Shape shape1 = shapeFactory.getShapeType("RECTANGLE");
	      //call draw method of Shape Rectangle
	      shape1.draw();
	      //get an object of Shape Square 
	      Shape shape2 = shapeFactory.getShapeType("SQUARE");
	      //call draw method of Shape Square
	      shape2.draw();
	      //get shape factory
	      AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
	      //get an object of Shape Rectangle
	      Shape shape3 = shapeFactory1.getShapeType("RECTANGLE");
	      //call draw method of Shape Rectangle
	      shape3.draw();
	      //get an object of Shape Square 
	      Shape shape4 = shapeFactory1.getShapeType("SQUARE");
	      //call draw method of Shape Square
	      shape4.draw();

	}

}
