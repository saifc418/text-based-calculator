package textBasedCalculator;

import java.util.Scanner;

import java.io.*;

import java.util.NoSuchElementException;

public class TextBasedCalculator {

	// Declare the variables and scanner
	public String userInput; // Holds the user's input
	public String operationStr; // Holds the operation entered by the user. Ex: 'add'
	Scanner operationScnr; // Scanner object to later read user's input or contents of file
	double num1; // Holds the first value in the operation sequence
	double num2; // Holds the second value in the operation sequence

	// Method for adding two numbers
	public void add() {

		// Try this block
		try {

			// Read the two values the user entered after the operation sign
			// and convert them from strings to doubles
			num1 = Double.valueOf(operationScnr.next());
			num2 = Double.valueOf(operationScnr.next());

			// Add the two values together and display the results
			System.out.print("Result: " + num1 + " + " + num2 + " = ");
			System.out.printf("%.2f\n", (num1 + num2));
		}

		// Run this block if the user entered a value that is not a number
		catch (NumberFormatException e) {

			// Input after 'add' is not a number
			System.out.println("Error: Invalid input.");
			
			// Clear the scanner
			clearScanner();
		}

		// Run this block if the user did not enter two values after the operation sign
		catch (NoSuchElementException e) {

			// Must enter two digits after 'add'
			System.out.println("Error: Invalid input.");
			
			// Clear the scanner
			clearScanner();
		}
	}

	// Method for subtracting two numbers
	public void subtract() {

		// Try this block
		try {

			// Read the two values the user entered after the operation sign
			// and convert them from strings to doubles
			num1 = Double.valueOf(operationScnr.next());
			num2 = Double.valueOf(operationScnr.next());

			// Subtract the two values and display the results
			System.out.print("Result: " + num1 + " - " + num2 + " = ");
			System.out.printf("%.2f\n", (num1 - num2));
		}

		// Run this block if the user entered a value that is not a number
		catch (NumberFormatException e) {

			// Input after 'subtract' is not a number
			System.out.println("Error: Invalid input.");
			
			// Clear the scanner
			clearScanner();
		}

		// Run this block if the user did not enter two values after the operation sign
		catch (NoSuchElementException e) {

			// Must enter two digits after 'subtract'
			System.out.println("Error: Invalid input.");
			
			// Clear the scanner
			clearScanner();
		}
	}

	// Method for multiplying two numbers
	public void multiply() {

		// Try this block
		try {

			// Read the two values the user entered after the operation sign
			// and convert them from strings to doubles
			num1 = Double.valueOf(operationScnr.next());
			num2 = Double.valueOf(operationScnr.next());

			// Multiply the two values and display the results
			System.out.print("Result: " + num1 + " x " + num2 + " = ");
			System.out.printf("%.2f\n", (num1 * num2));
		}

		// Run this block if the user entered a value that is not a number
		catch (NumberFormatException e) {

			// Input after 'multiply' is not a number
			System.out.println("Error: Invalid input.");
			
			// Clear the scanner
			clearScanner();
		}

		// Run this block if the user did not enter two values after the operation sign
		catch (NoSuchElementException e) {

			// Must enter two digits after 'multiply'
			System.out.println("Error: Invalid input.");
			
			// Clear the scanner
			clearScanner();
		}
	}

	// Method for dividing two numbers
	public void divide() {

		// Try this block
		try {

			// Read the two values the user entered after the operation sign
			// and convert them from strings to doubles
			num1 = Double.valueOf(operationScnr.next());
			num2 = Double.valueOf(operationScnr.next());

			// If num2 equals 0 (user tries to divide by 0), run this block
			if (num2 == 0) {

				// Inform user that the program cannot divide by 0
				System.out.println("Error: Cannot divide by 0.");

				// Clear the scanner
				clearScanner();

				// Break out of the method
				return;
			}

			// Divide the two values and display the results
			System.out.print("Result: " + num1 + " ÷ " + num2 + " = ");
			System.out.printf("%.2f\n", (num1 / num2));
		}

		// Run this block if the user entered a value that is not a number
		catch (NumberFormatException e) {

			// Input after 'divide' is not a number
			System.out.println("Error: Invalid input.");
			
			// Clear the scanner
			clearScanner();
		}

		// Run this block if the user did not enter two values after the operation sign
		catch (NoSuchElementException e) {

			// Must enter two digits after 'divide'
			System.out.println("Error: Invalid input.");
			
			// Clear the scanner
			clearScanner();
		}
	}

	// Method for powering two numbers
	public void pow() {

		// Try this block
		try {

			// Read the two values the user entered after the operation sign
			// and convert them from strings to doubles
			num1 = Double.valueOf(operationScnr.next());
			num2 = Double.valueOf(operationScnr.next());

			// Power the two values and display the results
			System.out.print("Result: " + num1 + " ^ " + num2 + " = ");
			System.out.printf("%.2f\n", (Math.pow(num1, num2)));
		}

		// Run this block if the user entered a value that is not a number
		catch (NumberFormatException e) {

			// Input after 'pow' is not a number
			System.out.println("Error: Invalid input.");
			
			// Clear the scanner
			clearScanner();
		}

		// Run this block if the user did not enter two values after the operation sign
		catch (NoSuchElementException e) {

			// Must enter two digits after 'pow'
			System.out.println("Error: Invalid input.");
			
			// Clear the scanner
			clearScanner();
		}
	}

	// Method for square rooting two numbers
	public void sqrt() {

		// Try this block
		try {

			// Read the value the user entered after the operation sign
			// and convert it from a string to a double
			num1 = Double.valueOf(operationScnr.next());

			// If num1 is less than 0 (user tries to square root a negative number),
			// run this block
			if (num1 < 0) {

				// Inform user that the program cannot square root negative numbers
				System.out.println("Error: Cannot compute square root of a negative number.");

				// Clear the scanner
				clearScanner();

				// Break out of the method
				return;
			}

			// Square root the number and display the results
			System.out.print("Result: √" + (num1) + " = ");
			System.out.printf("%.2f\n", Math.sqrt(num1));

		}

		// Run this block if the user entered a value that is not a number
		catch (NumberFormatException e) {

			// Input after 'sqrt' is not a number
			System.out.println("Error: Invalid input.");
			
			// Clear the scanner
			clearScanner();
		}

		// Run this block if the user did not enter a value after the operation sign
		catch (NoSuchElementException e) {

			// Must enter a digit after 'sqrt'
			System.out.println("Error: Invalid input.");
			
			// Clear the scanner
			clearScanner();
		}
	}

	// Method to clear operationScnr scanner object
	public void clearScanner() {

		// Loop while the scanner contains something
		while (operationScnr.hasNext()) {

			// Get the next string in the scanner
			operationScnr.next();
		}
	}

	// Method for combining all operation methods together.
	// Processes user's input with scanner object and runs
	// corresponding operation method(s).
	public void operations(Scanner scanner) {

		// While the scanner has another value, run this loop
		while (operationScnr.hasNext()) {

			// Read the next value in the scanner
			operationStr = operationScnr.next();

			// Run this block if the value is 'add'
			if (operationStr.equals("add")) {

				// Run the add() method
				add();
			}

			// Run this block if the value is 'subtract'
			else if (operationStr.equals("subtract")) {

				// Run the subtract() method
				subtract();
			}

			// Run this block if the value is 'multiply'
			else if (operationStr.equals("multiply")) {

				// Run the multiply() method
				multiply();
			}

			// Run this block if the value is 'divide'
			else if (operationStr.equals("divide")) {

				// Run the divide() method
				divide();
			}

			// Run this block if the value is 'pow'
			else if (operationStr.equals("pow")) {

				// Run the pow() method
				pow();
			}

			// Run this block if the value is 'sqrt'
			else if (operationStr.equals("sqrt")) {

				// Run the sqrt() method
				sqrt();
			}

			// Run this block if the value is not a valid operation
			else {

				// Inform the user that their input was invalid
				System.out.println("Error: Invalid input.");

				// Clear the scanner
				clearScanner();
			}
		}

		// Close the scanner
		operationScnr.close();
	}

	// Method for calling operations(Scanner scanner) method
	// with the user's input
	public void calcOperation(String userInput) {

		// Initialize scanner object with string of user's input
		operationScnr = new Scanner(userInput);

		// Call the method
		operations(operationScnr);

		// Close the scanner
		operationScnr.close();
	}

	// Method for calling operations(Scanner scanner) method
	// with a file
	public void calcOperationFile(String filename) {

		// Try this block
		try {

			// Declare and initialize FileReader object (opens file)
			FileReader fr = new FileReader(filename);

			// Declare and initialize scanner object of file
			Scanner frLineScanner = new Scanner(fr);

			// Declare variable
			String frLine; // Later holds values from a line in the file

			// Loop while the scanner has another line
			while (frLineScanner.hasNextLine()) {

				// Read the line from the file
				frLine = frLineScanner.nextLine();

				// Initialize the scanner object of the line
				operationScnr = new Scanner(frLine);

				// Inform the user which line in the file is being processed
				System.out.println("Processing line: " + frLine);

				// Call the operations(Scanner scanner) method
				operations(operationScnr);
			}

			// Close the scanner object
			frLineScanner.close();
		}

		// Run this block if the file does not exist
		catch (FileNotFoundException e) {

			// Inform the user that the file is not found
			System.out.println("File not found: " + e.getMessage());
		}

		// Run this block if there is an IO Exception
		catch (IOException e) {

			// Inform the user that there was an IO Exception
			System.out.println("IO Exception: " + e.getMessage());
		}
	}
}
