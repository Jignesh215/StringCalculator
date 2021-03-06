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
	public void negInputExceptionReturn() throws Exception {
		try {
			calculator.add("-1,2");
		}
		catch (IllegalArgumentException e){
			assertEquals(e.getMessage(), "Negatives not allowed: -1");
		}

		try {
			calculator.add("2,-4,3,-5");
		}
		catch (IllegalArgumentException e){
			assertEquals(e.getMessage(), "Negatives not allowed: -4,-5");
		}
	}
	
	@Test
	public void ignoreGreaterThan1000Return() throws Exception {
		assertEquals(calculator.add("10,20,2000"), 30);
	}
	 
	@Test
    public void anyLengthDelimitersReturn() throws Exception{
    	assertEquals(6, calculator.multDelimiters("?//[***]\n1***2***3?"));
    }
    @Test
    public void allowMultipleDelimiters() throws Exception{
    	assertEquals(6, calculator.multDelimiters("?//[*][%]\\n1*2%3?"));
    }
    @Test
    public void lengthLongerThenOneCharacter() throws Exception{
    	assertEquals(9, calculator.multDelimiters("?//[**][%%]\\n1**5%%3?"));
    }
	
}
