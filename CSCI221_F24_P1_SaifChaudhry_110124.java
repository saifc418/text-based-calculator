package project1;

import java.util.Scanner;

public class CSCI221_F24_P1_SaifChaudhry_110124 {

	public static void main(String[] args) {

		// Declare variable
		String filename; // Later in the program, holds the absolute path to the user's file

		// Create scanner object
		Scanner scanner = new Scanner(System.in);

		// Create object of TextBasedCalculator class
		TextBasedCalculator calculator = new TextBasedCalculator();

		// Welcome the user
		System.out.println("Welcome to Text-Based Calculator!\n");

		// Inform user of operation format
		System.out.println("Type operations as follows: operation number1 number2\n");

		// Inform user how to read from a file
		System.out.print("To read from a file, type 'file' and click enter. Then, ");
		System.out.println("enter the absolute path to the file.\n");

		// Inform user how to terminate program
		System.out.println("Type 'exit' to quit the program.\n");

		// Run this loop while true
		while (true) {

			// Inform user to enter a command
			System.out.print("Enter a command: ");

			// Read the read the user's input and trim off any extra white space
			calculator.userInput = scanner.nextLine().trim();

			// Run this block if the user typed 'exit'
			if (calculator.userInput.equals("exit")) {

				// Thank the user for using the program
				System.out.println("\nThank you for using the Text-Based Calculator!");

				// Break out of the while loop
				break;
			}

			// Run this block if the user typed 'file'
			else if (calculator.userInput.equals("file")) {

				// Inform user to enter the absolute path to the file
				System.out.print("Enter the absolute path to the file: ");

				// Read the user's input
				filename = scanner.nextLine();

				// Run the file through the method calcOperationFile(String filename)
				calculator.calcOperationFile(filename);
			}

			// Run this block if the above if-statements did not execute
			else {

				// Run the user's input through the method calcOperation(String userInput)
				calculator.calcOperation(calculator.userInput);
			}
		}

		// Close the scanner object
		scanner.close();
	}
}