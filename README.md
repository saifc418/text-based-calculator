# Introduction - Text-Based-Calculator
This project is a Text-Based-Calculator in Java. This program accepts user input in the console where they can enter math operations to be computed. The user can also enter the absolute path to a text file containing math operations to be computed. 

# Installation
Download the two .java files named Main.java and TextBasedCalculator.java. Be sure to uncomment the first line in the .java files containing "package project1;." Change the package name to the name of the package on your local machine, if necessary.

# Usage
To start, run the Main.java file. The user will then be prompted with a welcoming introduction and instructions on how to use the program. When the program prompts "Enter a command: " the user has three options to enter. One option is to enter a direct operation with the format operation num1 num2. For example, "add 5 10." Another example is "sqrt 16." The user may also enter multiple operations on one line. For example, "add 5 10 subtract 25 5." The second option the user may enter is "file." After entering "file" and clicking enter on the keyboard, the user will be prompted to enter the absolute path to a file containing operations. Then, the program will compute the operations. The third option the user may enter is "exit," which will terminate the program and the program will thank the user for using the program.

**Example Usage of Option 1:** (https://imgur.com/a/Tw4re5e)

**Example Usage of Option 2:** (https://imgur.com/qP3yEba)

**Example Usage of Option 3:** (https://imgur.com/a/4ZxYTto)

# File Format

**NOTE 1:** Do not enter the file path in quotation marks. Otherwise, the program will not read the file.

**NOTE 2:** Enter the absolute path to the file.

**NOTE 3:** The file should be a text file (.txt).

**NOTE 4:** The user may enter one or more operations per line in the file.

# List of Operations
Below are the possible operation formats.
1. add num1 num2
2. subtract num1 num2
3. multiply num1 num2
4. divide num1 num2
5. pow num1 num2
6. sqrt num1

# Error Handling
The program performs a variety of error handling. If the user enter enters "file" and then enters an incorrect path to a file, a non-existent file, or an incorrect directory, the program will inform the user of the error. If the user enters an invalid operation, such as dividing by 0, square rooting a negative number, or any other incorrect operation formats such as "add num1" instead of "add num1 num2," the program will inform the user of the error.

# Class and Method Explanation
1. **TextBasedCalculator Class**

    - **add()** Reads two numbers from a string scanner object and converts them to doubles. Then, adds the two numbers and outputs the result to the user. Catches a NumberFormatException if at least one of the two strings in the scanner is not a number or NoSuchElementException if there are less than two elements in the scanner and informs the user of the error.
    
    - **subtract()** Reads two numbers from a string scanner object and converts them to doubles. Then, subtracts the two numbers and outputs the result to the user. Catches a NumberFormatException if at least one of the two strings in the scanner is not a number or NoSuchElementException if there are less than two elements in the scanner and informs the user of the error.

    - **multiply()** Reads two numbers from a string scanner object and converts them to doubles. Then, multiplies the two numbers and outputs the result to the user. Catches a NumberFormatException if at least one of the two strings in the scanner is not a number or NoSuchElementException if there are less than two elements in the scanner and informs the user of the error.

    - **divide()** Reads two numbers from a string scanner object and converts them to doubles. Then, checks if the second number is 0. If the second number is 0, the program informs the user that they cannot divide by 0 and terminates the method. Otherwise, divides the two numbers and outputs the result to the user. Catches a NumberFormatException if at least one of the two strings in the scanner is not a number or NoSuchElementException if there are less than two elements in the scanner and informs the user of the error.

    - **pow()** Reads two numbers from a string scanner object and converts them to doubles. Then, powers the two numbers and outputs the result to the user. Catches a NumberFormatException if at least one of the two strings in the scanner is not a number or NoSuchElementException if there are less than two elements in the scanner and informs the user of the error.

    - **sqrt()** Reads a number from a string scanner object and converts it to a double. Then, checks if the number is negative. If the number is negative, the program informs the user that they cannot square root a negative number and terminates the method. Otherwise, square roots the number and outputs the result to the user. Catches a NumberFormatException if the string in the scanner is not a number or NoSuchElementException if there are no elements in the scanner and informs the user of the error.

    - **operations(Scanner scanner)** A scanner object of a string containing operations entered by the user in console is passed into the method. The method loops while the scanner has a value. The method reads the next value in the input. If the value is one of add, subtract, multiply, divide, pow, or sqrt, it will run the corresponding method. Otherwise, it will inform the user "Error: Invalid input." Once the scanner is empty, the method closes the scanner.

    - **calcOperations(String userInput)** A string containing operations entered by the user in console is passed into the method. Then, the method creates a new scanner object on the string. The method then passes this scanner into **operations(Scanner scanner)**. Finally, the method closes the scanner.

    - **calcOperationsFile(String filename)** A string containing the absolute path to a file is passed into the method. Then, the method creates a new FileReader object on the file. The FileReader object is then passed into a scanner object. The method then loops while the scanner has a value. In the while loop, the method reads the next line in the scanner. The method then passes this line into a new scanner pbject and informs the user of the line that is about to be processed. The new scanner object is then passed into the **operations(Scanner scanner)** method. After the while loop terminates, the scanner object called on the file is closed. The method also catches a FileNotFoundException if the file does not exist and informs the user or catches an IOException and informs the user.

    - **clearScanner()** Clears the operationScnr scanner object. This method runs whenever there is an input error by the user when entering math operations.

2. **Main Class**
    - This class contains the main method. It creates an object of the TextBasedCalculator class. The user is then welcomed to the program, and given instructions on how to enter operations in console, read from a file, and terminate the program. The method then loops while true, prompts the user to enter a command, and reads the user's input. If the user types "exit," the method thanks the user for using the program and breaks out of the loop, terminating the program. If the user types "file," the program prompts the user to enter the absolute path to the file. Then, the user's input is passed into the **calcOperationsFile(String filename)** method. Otherwise, if the user did not type "exit" or "file," the method passes the user's input into **calcOperations(String string)**. When the while loop ends, the method closes the scanner object and terminates the program.

# Support
For support or contact, reach out to **Saif Chaudhry** via **chaudhrysa@g.cofc.edu**.

# Roadmap
In the future, the program will include order of operations, cube roots, and a graphics based calculator.

# Contribution
Other developers may contribute, edit, or further develop the program, but must cite **Saif Chaudhry** and **chaudhrysa@g.cofc.edu**.

# Authors and Acknowledgment

**Saif Chaudhry:** Fully developed both the TextBasedCalculator and Main classes.

# License
Student Programming Project for College of Charleston
