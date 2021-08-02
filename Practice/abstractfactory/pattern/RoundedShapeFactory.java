package com.abstractfactory.pattern;

public class RoundedShapeFactory extends AbstractFactory {

	@Override
	public
	Shape getShapeType(String type) {
		// TODO Auto-generated method stub
		 if(type.equalsIgnoreCase("RECTANGLE")){
	         return new RoundedRectangle();         
	      }else if(type.equalsIgnoreCase("SQUARE")){
	         return new RoundedSquare();
	      }	
		return null;
	}

}
