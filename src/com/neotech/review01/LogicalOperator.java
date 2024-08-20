package com.neotech.review01;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		
		/*/
		 * Ask the user to enter the age
		 * if age is 0 --> You are a newborn
		 * if age is from 1 to 3 --> You are a baby
		 * if age is from 4 to 5 --> You are a toddler
		 * if age is from 6 to 12 --> You are a kid
		 * if age is from 13 to 19 --> You are a teenager
		 * if age >= 20 --> You are an adult
		 */
				 
		Scanner paul = new Scanner(System.in);
		
		System.out.println("Please enter your age:");
		int age = paul.nextInt();
		
		String result = "";
		
		if (age == 0) {
			result = "newborn";
		}
		else if (age >= 1 && age <=3) { // usind AND && is beter for range
			result = "baby";
		}
		else if (age >= 4 || age <=5) { // using OR || is better for individual values
			result = "toddler";
		}
		else if (age >= 6 && age <= 12) {
			result = "kid";
		}
		else if (age >= 13 && age <= 19) {
			result = "adult";
		}
		else {
			result = "alien";
		}
	
	System.out.println("You are a/an " + result);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
