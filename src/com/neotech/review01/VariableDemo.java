package com.neotech.review01;

public class VariableDemo {

	//ALWAYS format you code. 
	//Windows STRG + Shift + f
	//MAC     CMD  + Shift + f
	
	public static void main(String[] args) {
	
		// Declare a variable
		String firstName;
		
		// System.out.println("My name is -> " + firstName);
		
		//Assign a value (initialize)
		firstName = "Sitora";
		
		System.out.println("My name is -> " + firstName);
		
		// Declare a variable & Assign a value
		String lastName = "Abduvosieva";
		
		int age = 20;
		
		System.out.println(firstName +  " " + lastName + " " + age + 1);
		System.out.println(firstName +  " " + lastName + " " + (age + 1));
		
		System.out.println(age);
		
		//After 10 years
		//age = age + 10
		age += 10;
		lastName = "Pitt";
		
		System.out.println("After getting married!");
		System.out.println(firstName +  " " + lastName + " " + age);
		
		
		
		
		
		

	}

}
