package com.neotech.review01;

import java.util.Scanner;

public class LogicalOperatorRichBoy {

	public static void main(String[] args) {
		// If you are a boy
				// If you are rich -- Buy a Ferrari
				// otherwise -- Read a book

				// If you are a girl
				// if you are rich -- Buy a LV bag
				// otherwise -- Read a book

				// If you are none
				// Invalid gender

				Scanner input = new Scanner(System.in);

				System.out.println("Please enter your gender: (M/F)");
				char gender = input.next().charAt(0);

				System.out.println("Are you rich? (true/false)");
				boolean rich = input.nextBoolean();
				
				
				
				if (gender == 'M' || gender == 'm' && rich) { // rich male
					System.out.println("Buy a Ferrari");
				}
				else if (gender == 'M' || gender == 'm' && !rich) { // poor male
					System.out.println("Play Soccer");
				}
				else if (gender == 'F' || gender == 'f' && rich) { // rich female
					System.out.println("Buy a LV Bag");
				}
				else if (gender == 'F' || gender == 'f' && !rich) { // poor female
					System.out.println("Read a Book");
				}
				else {
					System.out.println("Invalid gender");
				}
				
				
				
				
				
				
				
				
				
				
				
	}

}
