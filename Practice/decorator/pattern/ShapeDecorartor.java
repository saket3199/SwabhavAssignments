package com.decorator.pattern;

public abstract class ShapeDecorartor implements Shape{
	 protected Shape decoratedShape;

	   public ShapeDecorartor(Shape decoratedShape){
	      this.decoratedShape = decoratedShape;
	   }

	   public void draw(){
	      decoratedShape.draw();
	   }	
	

}
