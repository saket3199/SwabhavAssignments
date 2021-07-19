package com.techlab.imovable.test;

import com.techlab.imovable.Bike;
import com.techlab.imovable.Car;
import com.techlab.imovable.IMovable;
import com.techlab.imovable.Truck;

public class IMovableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IMovable t = new Truck();
		IMovable c = new Car();
		IMovable b = new Bike();
		printInfo(t);
		printInfo(c);
		printInfo(b);
		
	}

	private static void printInfo(IMovable obj) {
		// TODO Auto-generated method stub
		obj.start();
		obj.stop();
	}

}
