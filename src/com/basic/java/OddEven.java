package com.basic.java;
//To check that given number is even or odd.

import java.util.Scanner;

public class OddEven {
	private static Scanner scan;
	private static char choice;
	public static void main(String[] args) {
		scan = new Scanner(System.in);	
		do {
			System.out.println("Enter the number to check that number is even or odd: ");
			double num1 = scan.nextDouble();
			if (num1 == 0) {
				System.out.println("Number is even");
			}
			if (num1 < 1) {
				System.out.println("Please enter number grater than 1.");
			}
			if (num1 % 2 == 0) {
				System.out.println("Number is even");
			} else {
				System.out.println("Number is odd.");
			}
			System.out.println("Would you like to continue type Y||y For exit press N||n) : ");
			choice = scan.next().charAt(0);
			if(choice== 'n' || choice=='N' ) {
				break;
			}
		} while (choice == 'Y' || choice == 'y');
		scan.close();
		System.out.println("Exit program");
	}
}
