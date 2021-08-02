package com.startegy.pattern.test;

import com.startegy.pattern.Context;
import com.startegy.pattern.OperationAdd;
import com.startegy.pattern.OperationMultiply;
import com.startegy.pattern.OperationSubtract;

public class StrategyPatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context context = new Context(new OperationAdd());
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

		context = new Context(new OperationSubtract());
		System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

		context = new Context(new OperationMultiply());
		System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
	}

}
