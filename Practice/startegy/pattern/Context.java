package com.startegy.pattern;

public class Context {
	 private Strategy strategy;

	   public Context(Strategy strategy){
	      this.strategy = strategy;
	   }

	   public int executeStrategy(int num1, int num2){
	      return strategy.doOperations(num1, num2);
	   }

}
