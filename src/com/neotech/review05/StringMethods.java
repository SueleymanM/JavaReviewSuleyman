package com.neotech.review05;

public class StringMethods {

	public static void main(String[] args) {
		String str = "Pershendetje";

		System.out.println(str.length());

		System.out.println(str.isEmpty());

		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());

		System.out.println(str); // The original has NOT changed

		boolean equal = str.equals("PERSHENDETJE");
		System.out.println("equal -> " + equal);

		System.out.println(str.equalsIgnoreCase("PERSHENDETJE"));

		System.out.println("--------------------------------");

		System.out.println(str.contains("SH"));
		System.out.println(str.contains("SH".toLowerCase()));

		boolean start = str.startsWith("per");
		System.out.println(start);

		System.out.println("Does Pershendetje start with Pershendetje?");
		System.out.println(str.startsWith("Pershendetje"));

		System.out.println("Does Pershendetje end with tje?");
		System.out.println(str.endsWith("tje"));

		System.out.println("--------------------------------");

		String name = "Risha" + "-" + "Tan";
		System.out.println(name);

		String name2 = "Risha".concat("-").concat("Tan"); // Method chaining
		System.out.println(name2);

		String name3 = "Risha".toUpperCase().concat("-").concat("Tan");
		System.out.println(name3);

		// "Risha".length().concat("Tan"); // Compile Time Error
		// 5.concat("Tan");

		"Risha".concat("Tan").length(); // This is OK
		System.out.println("Risha".concat("Tan").length());

		System.out.println("--------------------------------");

		String str2 = "       Elma    is Happy     ";
		System.out.println(str2.trim());

		System.out.println(str2.length());
		System.out.println(str2.trim().length());

		System.out.println("--------------------------------");

		String str3 = "Bunmi is very smart";
		char letter = str3.charAt(2);
		System.out.println(letter);

		System.out.println("The index of letter 'm' is -> " + str3.indexOf('m'));

		// Find the index of letter 'm', but start looking after index 5
		int indexOfSecondM = str3.indexOf('m', 5);
		System.out.println("indexOfSecondM -> " + indexOfSecondM);

	}
}
