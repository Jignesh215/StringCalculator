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
	public void emptyReturn() {
		assertEquals(calculator.calculate(""),0);
	}
	@Test
	public void singleValueReturn() {
		assertEquals(calculator.calculate("1"),1);
	}
	@Test
	public void doubleValueReturn() {
		assertEquals(calculator.calculate("4,5"), 9);
	}
}
