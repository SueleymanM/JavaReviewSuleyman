package com.neotech.review01;

import java.util.Scanner;

public class NestedIfRichBoy {

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

		if (gender == 'M' || gender == 'm') {
			System.out.println("Yaaay, it's a boy!");

			if (rich) {
				System.out.println("Buy a Ferrari");
			} else {
				System.out.println("Play Soccer");
			}
		} else if (gender == 'F' || gender == 'f') {
			System.out.println("Oh no, it's a girl!");

			if (rich) {
				System.out.println("Buy a LV bag");
			} else {
				System.out.println("Read a book");
			}
		} else {
			System.out.println("Invalid gender");
		}

	}

}
