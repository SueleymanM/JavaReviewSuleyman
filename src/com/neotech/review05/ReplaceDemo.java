package com.neotech.review05;

public class ReplaceDemo {

	public static void main(String[] args) {
		String longStr = "I am very happy today because today is not Monday";

		String anotherStr = longStr.replace('a', 'e');
		System.out.println(anotherStr);

		anotherStr = longStr.replace("today", "tomorrow");
		System.out.println(anotherStr);

		System.out.println("--------------------------------");

		anotherStr = longStr.replaceAll("[a-z]", "*");
		System.out.println(anotherStr);

		String ssn = "492-73-4156";
		System.out.println(ssn);

		String newSSN = ssn.replaceAll("[2-4]", "#");
		System.out.println(newSSN);

		System.out.println("Let's remove the dashes from ssn");
		String numbers = ssn.replaceAll("-", "");
		System.out.println(numbers);

		// A task for Emin, Umut, Abit and other hard working students
		// Hide all the numbers and leave the last four digits of ssn
		// ***-**-4156

	}
}
