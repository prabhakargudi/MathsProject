package com.sapariba.testcases;

import org.junit.Assert;
import org.junit.Test;

import com.sapariba.maths.CalculationDemo;

public class SubstractionTestCases {
	
	CalculationDemo cal=new CalculationDemo();
	
	@Test
	public void substractTwoPositiveNumbers()
	{
		int expected=70;
		int actual=cal.substraction(100,30);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void substractTwoNegativeNumbers()
	{
		int expected=-10;
		int actual=cal.substraction(-40, -30);
		Assert.assertEquals(expected, actual);
	}

}
