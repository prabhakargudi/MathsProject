package com.sapariba.testcases;

import org.junit.Assert;
import org.junit.Test;

import com.sapariba.maths.CalculationDemo;

public class DivisionTestCases {
	
	CalculationDemo cal=new CalculationDemo();
	
	@Test
	public void divideTwoPositiveNumbers()
	{
		int expected=10;
		int actual=cal.division(100, 10);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void divideTwoNegativeNumbers()
	{
		int expected=-10;
		int actual=cal.division(-70, 7);
		Assert.assertEquals(expected, actual);
	}

}
