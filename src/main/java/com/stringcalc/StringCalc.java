package com.stringcalc;

public class StringCalc {

	
	public int add(String inp) throws Exception {
		
		if(isEmpty(inp)) {
			return 0;
		}
		else{
			String delimiter = ",";
			if(inp.matches("//(.*)\n(.*)")){
				delimiter = Character.toString(inp.charAt(2));
				inp = inp.substring(4);
			}
			
			String numList[] = splitNum(inp, delimiter + "|\n");
			return sumOfTwoNum(numList);
		}
	}
	
	
	private boolean isEmpty(String inp) {
		return inp.isEmpty();
	}
	
	private int strToInt(String inp) {
		return Integer.parseInt(inp);
	}
	private static String[] splitNum(String numbers, String divider){
	    return numbers.split(divider);
	}
	private int sumOfTwoNum(String[] integers) throws Exception {
		 int sum = 0;
	 	    String negativeNum = "";

	        for(String num : integers){
	        	if(strToInt(num) < 0){
	        		if(negativeNum.equals("")) {
	        			negativeNum = num;
	        		}else {
	        			negativeNum += ("," + num);
	        		}
	        	}
	        	if(strToInt(num) < 1000)
			    	sum += strToInt(num);
			}

			if(!negativeNum.equals("")){
				throw new IllegalArgumentException("Negatives not allowed: " + negativeNum);
			}

			return sum;
	}
}