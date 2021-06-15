package com.simplilearn.asg1.calc;

public class Calculator {

	public int add(int a, int b)
	{
		return a+b;
	}
	
	int subtract(int a, int b)
	{
		return a-b;
	}
	
	int multiply(int a, int b)
	{
		return a*b;
	}
	
	float divide(int a, int b)
	{
		try {
		return (float)a/(float)b;
		}
		catch(ArithmeticException  e) {
			System.out.println("divisor can not be zero");
			return (0);
		}

	}
	
	float percentage(int a)
	{
		return (float)a/100;
	}
}
