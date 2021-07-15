package com.techlab.iemotionable.test;

import com.techlab.iemotionable.Boy;
import com.techlab.iemotionable.ISocializable;
import com.techlab.iemotionable.Man;

public class IEmotionable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Man m = new Man();
		Boy b = new Boy();
		printInfo(m);
		printInfo(b);
	}

	public static void printInfo(IEmotionable s) {

		try {
			((ISocializable) s).depart();
		} catch (Exception m) {
			System.err.println(m);
		}
		try {
			((ISocializable) s).wish();
		} catch (Exception m) {
			System.err.println(m);
		}
		
		((com.techlab.iemotionable.IEmotionable) s).cry();
		((com.techlab.iemotionable.IEmotionable) s).laugh();
	}


	}


