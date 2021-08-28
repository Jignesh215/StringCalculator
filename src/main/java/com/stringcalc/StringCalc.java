package com.stringcalc;

public class StringCalc {

	private final String  deli = ",|\n";
	public int add(String inp) {
		String[] integers = inp.split(deli);
		if(isEmpty(inp)) {
			return 0;
		}
		if(inp.length()==1) {
			return stringToInt(inp);
		} else {
			return sumOfTwoNum(integers[0],integers[1]);
		}
	}
	
	
	private boolean isEmpty(String inp) {
		return inp.isEmpty();
	}
	
	private int stringToInt(String inp) {
		return Integer.parseInt(inp);
	}
	private int sumOfTwoNum(String num1, String num2) {
		return Integer.parseInt(num1) + Integer.parseInt(num2);
	}
}
