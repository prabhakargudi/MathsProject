package com.sapariba.testcases;

import org.junit.Assert;
import org.junit.Test;

import com.sapariba.maths.CalculationDemo;

public class MultiplicationTestCases {
	
CalculationDemo cal=new CalculationDemo();
	
	@Test
	public void multiplyTwoPositiveNumbers()
	{
		int expected=70;
		int actual=cal.multiplication(10,7);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void multiplyTwoNegativeNumbers()
	{
		int expected=-70;
		int actual=cal.multiplication(-10, 7);
		Assert.assertEquals(expected, actual);
	}

}
