package com.sapariba.testsuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({com.sapariba.testcases.AdditionTestCases.class,com.sapariba.testcases.MultiplicationTestCases.class,com.sapariba.testcases.SubstractionTestCases.class,com.sapariba.testcases.DivisionTestCases.class})
public class TestSuite {

}
