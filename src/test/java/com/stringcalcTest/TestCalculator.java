package com.stringcalcTest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import com.stringcalc.StringCalc;


public class TestCalculator {

	private StringCalc calculator;
	
	@Before
	public void init() {
		calculator = new StringCalc();
	}
	
	@Test
	public void emptyValueReturn() {
		assertEquals(calculator.add(""),0);
	}
	@Test
	public void singleValueReturn() {
		assertEquals(calculator.add("1"),1);
	}
	@Test
	public void doubleValueReturn() {
		assertEquals(calculator.add("4,5"), 9);
	}
	@Test
	public void newLineSumReturn() {
		assertEquals(calculator.add("2\n3"), 5);
	}
}
