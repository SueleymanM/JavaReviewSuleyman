package com.neotech.review03;

import java.util.Scanner;

public class ScannerArray {

	public static void main(String[] args) {

		// Ask the user: How many numbers do you want to store in the array?
		// Ask him to enter the numbers: Read numbers and enter them into the array
		// Print the numbers form the array
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("How many numbers do you want to store in the array");
		int size = input.nextInt();
		
		//declaring the array
		int[] array = new int[size];
		
		for (int i=0; i<size; i++) {
			System.out.println("Please enter a number");
			array[i] = input.nextInt();
			
		}
		
		
		
		//Printing the numbers from the array
		System.out.println("Lets print the numbers from the array");
		for (int i=0; i<array.length;i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		
		
		
		System.out.println("Lets print the numbers using enhanced loop");
		for (int num : array) {
			System.out.print(num + " ");
		}
		
		
		
		
		
		
		
		
	}

}
