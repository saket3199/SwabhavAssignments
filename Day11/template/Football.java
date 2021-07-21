package com.techlab.template;

public class Football extends Game {

	@Override
	public void initialize() {
		System.out.println("Football has Initalize");

	}

	@Override
	public void startPlay() {
		System.out.println("Football has Started");

	}

	@Override
	public void endPlay() {
		System.out.println("Football has Ended");

	}

}
