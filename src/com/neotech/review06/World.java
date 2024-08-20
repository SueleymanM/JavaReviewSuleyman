package com.neotech.review06;

public class World {

	public static void main(String[] args) {

		// 1st way, using the constructor with NO parameter
		Person p1 = new Person();
		p1.displayInfo();

		p1.name = "Uygar";
		p1.age = 30;
		p1.weight = 170;

		// private
		// p1.gender = 'M';

		p1.displayInfo();

		System.out.println("--------------------------------");

		// 2nd way, using the constructor with TWO parameter
		Person p2 = new Person("Sara", 30);
		p2.displayInfo();

		p2.weight = 120;
		p2.displayInfo();

		System.out.println("--------------------------------");

		// 3rd way, using the constructor with THREE parameter
		Person p3 = new Person("Tima", 20, 80);
		p3.displayInfo();

	}
}
