package com.observer.pattern;

public class BinaryObserver extends Observer {

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));

	}

	public BinaryObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);

	}
}
