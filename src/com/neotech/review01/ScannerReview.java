package com.neotech.review01;

import java.util.Scanner;

public class ScannerReview {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		// .next() read one word until space/enter
		
		
//		System.out.println("Please enter your first name:");
//		String firstName = input.next();
//		
//		System.out.println("Please enter your last name:");
//		String lastName = input.next();
//		
//		System.out.println("Your full name is -> " + firstName + "-" + lastName);
		
		System.out.println("----------------------------");
		
		// .nextLine() read the whole line until enter
		
//		System.out.println("Please enter your first name:");
//		String firstName = input.nextLine();
//		
//		System.out.println("Please enter your last name:");
//		String lastName = input.nextLine();
//		
//		System.out.println("Your full name is -> " + firstName + "-" + lastName);
		
	
		System.out.println("----------------------------");
		
		
		
		// .next() .nextInt() .nextDouble() .nextBoolean()
		// They all read until space or enter
//		System.out.println("Please enter an int, boolean, and double");
//		int num = input.nextInt();
//		boolean b = input.nextBoolean();
//		double d = input.nextDouble();
//		
//		System.out.println("You entered: " + num + " " + b + " " + d);
		
		
		System.out.println("----------------------------");
		
		System.out.println("Please enter a long sentence");
		
		String str1 = input.next();
		String str2 = input.next();
		String str3 = input.nextLine();
		
		System.out.println("str1->" + str1);
		System.out.println("str2->" + str2);
		System.out.println("str3->" + str3);
		
		
		
	}

}
