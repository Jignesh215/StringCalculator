package com.stringcalc;

public class StringCalc {

	private final String  deli = ",|\n|;";
	public int add(String inp) throws Exception {
		String[] integers = inp.split(deli);
		if(isEmpty(inp)) {
			return 0;
		}
		if(inp.length()==1) {
			return stringToInt(inp);
		} else {
			return sumOfTwoNum(integers);
		}
	}
	
	
	private boolean isEmpty(String inp) {
		return inp.isEmpty();
	}
	
	private int stringToInt(String inp) {
		return Integer.parseInt(inp);
	}
	private int sumOfTwoNum(String[] integers) throws Exception {
		negetiveInputs(integers);
		
		int sum =0;
		for (String curr : integers){
			sum += Integer.parseInt(curr);
			
		}
		return sum;
	}
		private void negetiveInputs(String[] integers) throws Exception {
			
		for(String curr: integers) {
			if(stringToInt(curr)<0) {
				throw new Exception("Negetive Input !" +curr+ "Not Allowed");
			}
		}
		}
}
