package com.techlab.template.test;

import com.techlab.template.Cricket;
import com.techlab.template.Football;
import com.techlab.template.Game;

public class TemplateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Game game=new Cricket();
		game.play();
		
		Game game1=new Football();
		game1.play();
	}

}
