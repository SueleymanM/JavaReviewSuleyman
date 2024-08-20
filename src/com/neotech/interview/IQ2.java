package com.neotech.interview;

public class IQ2 {

	public static void main(String[] args) {

		// Write a java program to check whether a given number is prime or not?
		// Prime number is a number that is greater than 1
		// Number 1 is NOT prime
		// Prime number is divisible by only 1 and itself

		int number = 35;
		boolean prime = true;

		if (number <= 1) {
			prime = false;
		} else {
			for (int i = 2; i < number/2; i++) {
				
				if(number % i==0) {
					//System.out.println(number + " is divisible by " + i);
					prime=false;
					break;
				}
				else {
					//System.out.println(number + " is not divisible by " + i);
				}
			}
		}
		
		System.out.println("-----------------------------------");
		System.out.println(number + " is prime? " + prime);

	}

}
