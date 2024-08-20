package com.neotech.review01;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
// ask the user to enter 2 numbers
		// ask the user fo the operator (+,-,*,/)
		// solve it using if-else
		
		Scanner carolina = new Scanner(System.in);
	
		System.out.println("Please enter the first number");
		double d1 = carolina.nextDouble();
		
		System.out.println("Please enter the second number");
		double d2 = carolina.nextDouble();
		
		//System.out.println(d1 + "<->" + d2);
	
		System.out.println("Please enter the operator (+,-,*,/)");
		String operator = carolina.next();
		
		double result = 0;
		
		if (operator.equals("+")) {
			result = d1 + d2;
		}
		else if (operator.equals("-")) {
			result = d1 - d2;
		}
		else if (operator.equals("*")) {
			result = d1 * d2;
		}
		else if (operator.equals("/")) {
			result = d1 / d2;
		}
		else {
			System.out.println("Invalid operator");
		}
	
	
		System.out.println("The result is -> " + result);
		
	
	carolina.close();
	
	
	
	
	}

}
