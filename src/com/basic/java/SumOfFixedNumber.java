package com.basic.java;

import java.util.Scanner;

public class SumOfFixedNumber {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Enter two number to obtain their sum : ");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		double sum = num1 + num2;
		System.out.println("The sum of first number : " + num1 + " and second number :" + num2 + " is : " + sum);
		printExitMessage();
	}

	private static void printExitMessage() {
		System.out.println("Program exit");
	}

}
