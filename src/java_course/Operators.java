package java_course;

//import java.util.Scanner;

public class Operators {
	
	public static void main(String[] args) {
		
		/*
		 * Exercise 1: Arithmetic Operators
		   Write a Java program that calculates and prints the 
		   sum, difference, product, quotient, and remainder of two numbers (e.g., num1 = 10 and num2 = 5).
		*/
		/*
		int number1 = 50;
		int number2 = 72;
		
		int sum = number1 + number2;
		int difference = number1 - number2;
		int product = number1 * number2;
		int quotient = number1 / number2;
		int reminder = number1 % number2;
		
		System.out.println("Sum " + sum);
		System.out.println("Difference " + difference);
		System.out.println("Product " + product);
		System.out.println("Quotient" + quotient);
		System.out.println("Reminder " + reminder);
		*/
		
		
		/*
		 * Exercise 2: Relational Operators
		 * Write a Java program that compares two numbers and prints whether 
		 * the first number is greater than, less than, or equal to the second number.
		*/
		/*
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("write a number");
		int number1 = scanner.nextInt();
		
		System.out.println("write the second number");
		int number2 = scanner.nextInt();
		
		if (number1 > number2) {
			System.out.println(number1 + " is greater than " + number2);
		} else if(number1 < number2) {
			System.out.println(number1 + " is less than " + number2);
		} else {
			System.out.println(number1 + " is equal to " + number2);
		};
		*/
		
		
		
		/*
		 * Exercise 3: Logical Operators
           Write a Java program that checks whether a number is divisible by both 3 and 5. 
           Print true if it is, otherwise print false.
		 * 
		*/
		/*
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("write a number");
		int number1 = scanner.nextInt();
		
		if (number1 % 3 == 0 && number1 % 5 == 0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		};
		*/
		
		
		/*
		 * Exercise 4: Increment and Decrement Operators
		   Write a Java program that demonstrates the usage of increment and decrement operators. 
		   Declare a variable and print its value before and after using these operators.
		*/
		/*
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("write a number");
		int number1 = scanner.nextInt();
		System.out.println("Number without increment " + number1);
		
		number1++;
		System.out.println("Number after increment: " + number1);
		*/
		
		
		/*
		Exercise 5: Conditional (Ternary) Operator
		Write a Java program that finds the maximum of three numbers using the conditional operator (? :). 
		Print the maximum number.
		*/
		/*
		int number1 = 456;
		int number2 = 786;
		int number3 = 985;
		
		int maxNumber = (number1 > number2 && number1 > number3) ? number1 : (number2 > number3) ? number2 : number3;
		System.out.println("The max number is " + maxNumber);
		*/
		
		
		/*
		 * Exercise 6:    
		   Write a Java program that demonstrates the usage of bitwise AND, OR, XOR, left shift, and right shift operators on two integers. 
		   Print the results of each operation.
		 * */
		/*
		// bitwiseAnd
		int bitwiseAnd = 5 & 3;
		// bitwiseOr
		int bitwiseOr = 5 | 3;
		// bitwiseXor
		int bitwiseXor = 5 ^ 3;
		// bitwiseNot
		int bitwiseNot = ~5;
		// leftShift
		int leftShift = 5 << 3;
		// rightShift
		int rightShift = 20 >> 2;
		
		System.out.println(bitwiseAnd);
		System.out.println(bitwiseOr);
		System.out.println(bitwiseXor);
		System.out.println(bitwiseNot);
		System.out.println(leftShift);
		System.out.println(rightShift);
		*/
		
		
	}
}
