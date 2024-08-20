package com.neotech.review05;

public class TestBora {

	public static void main(String[] args) {
		Bora b = new Bora();

		b.addTwoNumbers();
		b.addTwoNumbersThatIGive(7, 5);

		int res1 = b.addTwoNumbersAndGiveMeTheResult();

		int res2 = b.addTwoNumberThatIGiveAndGiveMeTheResult(6, 8);

		if (res2 == 14) {
			System.out.println("Good job Bora!");
		} else {
			System.out.println("I still love you!!!");
		}

		// I can directly print the result/return of the method
		System.out.println(b.addTwoNumberThatIGiveAndGiveMeTheResult(4, 5));

	}
}
