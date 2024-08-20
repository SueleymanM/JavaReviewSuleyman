package com.neotech.review02;

import java.util.Scanner;

public class CalculatorSwitch {

	public static void main(String[] args) {

				// ask the user to enter 2 numbers
				// ask the user for the operator (+,-,*,/)
				// solve it using if-else
		
		
		Scanner sufiyan = new Scanner(System.in);
		
		System.out.println("Please enter the first number");
		double d1 = sufiyan.nextDouble();
		
		System.out.println("Please enter the second number");
		double d2 = sufiyan.nextDouble();
		
		//System.out.println(d1 + "<->" + d2);
	
		System.out.println("Please enter the operator (+,-,*,/)");
		String operator = sufiyan.next();
		
		double result=0;
		
		
		switch (operator) {
		case "+":
			result=d1+d2;
			break;
		case "-":
			result=d1-d2;
			break;
		case "*":
		    result=d1*d2;
		    break;
		case "/":
			result=d1/d2;
			break;
			default:
				System.out.println("Invalid operator");
		}
	
		
		if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) 
			System.out.println("The result is -> " + result);
		
		
		
		
		
		
		
		
		
		sufiyan.close();
		
		
		
		
		
		
		
		
				
	}

}
