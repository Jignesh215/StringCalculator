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
	public void emptyValueReturn() throws Exception {
		assertEquals(calculator.add(""),0);
	}
	@Test
	public void singleValueReturn() throws Exception {
		assertEquals(calculator.add("1"),1);
	}
	@Test
	public void doubleValueReturn() throws Exception {
		assertEquals(calculator.add("4,5"), 9);
	}
	@Test
	public void newLineSumReturn() throws Exception {
		assertEquals(calculator.add("2\n3"), 5);
	}
	@Test
	public void threeValueDelimitedReturn() throws Exception {
		assertEquals(calculator.add("2\n3,3"), 8);
	}
	@Test
	public void moreThenThreeValueReturn() throws Exception {
		assertEquals(calculator.add("2\n3,3,2"), 10);
	}
	@Test
	public void multipleDelimeterReturn() throws Exception {
		assertEquals(calculator.add("2\n3;3,2"), 10);
	}
	@Test(expected = Exception.class)
	public void negInputExceptionReturn() throws Exception {
		calculator.add("-1");
		assertEquals(calculator.add("10;20,-10,10"), 40);
	}
	@Test
	public void ignoreGreaterThan1000() throws Exception {
		assertEquals(calculator.add("10;20,2000"), 30);
	}
}
