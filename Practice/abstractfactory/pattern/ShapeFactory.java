package com.abstractfactory.pattern;

public class ShapeFactory extends AbstractFactory{

	@Override
	public
	Shape getShapeType(String type) {
		// TODO Auto-generated method stub
		 if(type.equalsIgnoreCase("RECTANGLE")){
	         return new Rectangle();         
	      }else if(type.equalsIgnoreCase("SQUARE")){
	         return new Square();
	      }	 
	      
		return null;
	}

}
