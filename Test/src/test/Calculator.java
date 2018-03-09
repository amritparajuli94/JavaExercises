package test;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// constructor
		int num1 = 0;
		int num2 = 0;
		String operation;

		// creating an input object
		Scanner input = new Scanner(System.in);

		// getting the input
		System.out.println("Enter the first number");
		num1 = input.nextInt();

		System.out.println("Enter the second number");
		num2 = input.nextInt();

		// getting the input
		System.out.println("Please select the operation that you wish to do");
		operation = input.next();

		// if this operation do this
		if (operation.equals("+")) {
			System.out.println("The result for you chosen operation is " + (num1 + num2));
		}

		if (operation.equals("-")) {
			System.out.println("The result for you chosen operation is " + (num1 - num2));
		}

		if (operation.equals("*")) {
			System.out.println("The result for you chosen operation is " + (num1 * num2));
		}
		if (operation.equals("/")) {
			System.out.println("The result for you chosen operation is " + (num1 / num2));
		}
	}

}
