package com.techlab.manApp.hierichal.test;

import com.techlab.manApp.hierichal.Boy;
import com.techlab.manApp.hierichal.Infant;
import com.techlab.manApp.hierichal.Kid;
import com.techlab.manApp.hierichal.Man;

public class HierichalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Man mobj = new Man();
		mobj.eat();
		mobj.play();

		Boy bobj = new Boy();
		bobj.eat();
		bobj.play();
		bobj.read();

		Kid kobj = new Kid();
		kobj.eat();
		kobj.play();

		Infant iobj = new Infant();
		iobj.eat();
		iobj.play();

		case1();
		case2();
		case3();

		atThePark(new Man());
		atThePark(new Boy());
		atThePark(new Infant());
		atThePark(new Kid());
		cas4();
	}

	public static void case1() {
		Man x = new Man();
		x.eat();
		x.play();
	}

	public static void case2() {
		Boy y = new Boy();
		y.eat();
		y.play();
		y.read();
	}

	public static void case3() {
		Man x = new Boy();
		x.eat();
		x.play();

	}

	public static void atThePark(Man x) {
		System.out.println("At the park");
		x.eat();
		x.play();
	}

	public static void cas4() {
		Object x;
		x = 10;
		System.out.println(x.getClass());
		x = "hello";
		System.out.println(x.getClass());
		x = new Man();
		System.out.println(x.getClass());
	}
}
