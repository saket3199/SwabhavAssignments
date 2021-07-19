package com.techlab.imovable;

public class Truck implements IMovable {
	public void start() {
		System.out.println("Truck has been started");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Truck has stopped");
		
	}

}
