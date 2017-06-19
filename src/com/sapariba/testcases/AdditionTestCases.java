package com.sapariba.testcases;



import org.junit.Assert;
import org.junit.Test;

import com.sapariba.maths.CalculationDemo;

public class AdditionTestCases {
	CalculationDemo cal=new CalculationDemo();
	
	@Test
	public void addTwoPositiveNumbers()
	{
		int expected=70;
		int actual=cal.addition(50, 20);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void addTwoNegativeNumbers()
	{
		int expected=-70;
		int actual=cal.addition(-50, -20);
		Assert.assertEquals(expected, actual);
	}

}
