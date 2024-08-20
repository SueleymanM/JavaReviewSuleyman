package com.neotech.interview;

public class IQ4 {

	// Find out how many alpha characters are present in a String?
		// Find the number of words in a string?

		public static void main(String[] args) {

			String str = "dfg%^&DF3434  ere  @#67";

			// String is immutable. If you want to update it, you need to re-assign
			str = str.replaceAll("[^a-zA-Z]", "");

			System.out.println(str);

			System.out.println("The number of alpha characters = " + str.length());

			System.out.println("--------------------------------");

			String longStr = "Bye bye Java Hello Selenium";
			String[] words = longStr.split(" ");

			System.out.println("The number of words in the string = " + words.length);

			for (String w : words) {
				System.out.println(w);
			}
		}
}
