package com.basic.loop.java;
// Java Program: Validate Positive Number Inpu

import java.util.Scanner;

public class While1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = -1;

		// Keep asking until the user enters a positive number
		while (number <= 0) {
			System.out.print("Enter a positive number: ");
			if (scanner.hasNextInt()) {
				number = scanner.nextInt();
				if (number <= 0) {
					System.out.println("That's not a positive number. Try again.");
				}
			} else {
				System.out.println("Invalid input. Please enter a number.");
				scanner.next(); // Clear the invalid input
			}
		}

		System.out.println("Thank you! You entered: " + number);
		scanner.close();
	}
}
