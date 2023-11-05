package java_course;

//import java.util.Scanner;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Exercise 1: Variable Declaration and Initialization
		   Declare and initialize variables for the following data types: 
		   int, double, boolean, and String. Print out the values of these variables.
		*/
		/*
		int number = 10;
		double doubleNumber = 3.14;
		String hello = "Hello world!";
		
		System.out.println(number);
		System.out.println(doubleNumber);
		System.out.println(hello);
		*/
		
		
		/*
		### Exercise 2: Arithmetic Operations
		Create two variables of type int. Perform addition, subtraction, multiplication, division, and modulo operations on these variables and print the results.
		*/
		/*
		int number1 = 10;
		int number2 = 20;
		
		//addition
		int addition = number1 + number2;
		//subtraction
		int subraction = number1 - number2;
		//multiplication
		int multiplication = number1 * number2;
		//division
		int division = number1 / number2;
		//modulo
		int modulo = number1 % number2;
		
		System.out.println(" Addition " + addition );
		System.out.println(" Subtraction " + subraction );
		System.out.println(" Multiplication " + multiplication );
		System.out.println(" Division " + division );
		System.out.println(" Modulo " + modulo );
		
		
		*/
		
		
		/*
		### Exercise 3: User Input and Calculation
		Ask the user to enter two numbers. Read these numbers as input and calculate their sum, difference, product, quotient, and remainder. Print the results.
		*/
		/*
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("write the firs number");
		int firstNumber = scanner.nextInt();
		
		System.out.println("Write the second number");
		int secondNumber = scanner.nextInt();
		
		//sum
		int sum = firstNumber + secondNumber;
		//difference
		int difference = firstNumber - secondNumber;
		//product
		int product = firstNumber * secondNumber;
		//quotient
		int quotient = firstNumber / secondNumber;
		//remainder
		int remainder = firstNumber % secondNumber;
		
		System.out.println("Sum " + sum);
		System.out.println("Difference " + difference);
		System.out.println("Product  " + product);
		System.out.println("Quotient " + quotient);
		System.out.println("Remainder " + remainder);
		
		*/
		
		
		/*
		### Exercise 4: Temperature Conversion
		Create a program that converts temperature from Celsius to Fahrenheit. Ask the user to enter a temperature in Celsius and convert it to Fahrenheit using the formula: `F = C * 9/5 + 32`. Print the converted temperature.
		*/
		/*
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("write the temperature in C");
		int celsiusTemperature = scanner.nextInt();
		
		int fahrenheitConversion =  celsiusTemperature * 9/5 + 32;
		
		System.out.println("Fahrenheit " + fahrenheitConversion);
		*/
		
		
		
		/*
		### Exercise 5: Area of a Rectangle
		Ask the user to enter the length and width of a rectangle. Calculate its area using the formula: `area = length * width`. Print the area of the rectangle.
		*/
		/*
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("write the lenght of the rectangle");
		int lenghtRectangle = scanner.nextInt();
		
		System.out.println("write the width of the rectangle");
		int widthRectangle = scanner.nextInt();
		
		int rectangleArea = lenghtRectangle * widthRectangle;
		
		System.out.println("Area " + rectangleArea);
		
		*/
		
		
		
		/*
		### Exercise 6: Circle Area and Circumference
		Ask the user to enter the radius of a circle. Calculate and print its area and circumference using the formulas: `area = π * radius * radius` and `circumference = 2 * π * radius`, where π (pi) is approximately 3.14159.
		*/
		/*
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("write the radius of the circle");
		int radiusCircle = scanner.nextInt();
		
		double π = 3.14;
		int area = (int) π * radiusCircle * radiusCircle;
		double circumference = (double) 2 * π * radiusCircle;
		String formattedNumber = String.format("%.2f", circumference);
		
		System.out.println("Area " + area);
		System.out.println("Circumference " + formattedNumber);
		*/
		
		
		/*
		### Exercise 7: Boolean Operations
		Declare two boolean variables and perform AND, OR, and NOT operations on them. Print the results of these operations.
		*/
		/*
		boolean boolean1 = true;
		boolean boolean2 = false;
		
		boolean or = boolean1 || boolean2;
		boolean and = boolean1 && boolean2;
		boolean not = !boolean1;
		
		System.out.println(or);
		System.out.println(and);
		System.out.println(not);
		*/
		
		
		
		/*
		### Exercise 8: String Concatenation
		Create two String variables and concatenate them. Print the concatenated String.
		*/
		/*
		String name = "Hi I'm Gino ";
		String talk = "nice to meet you";
		
		String sentence = name.concat("").concat(talk);
		
		System.out.println(sentence);
		*/
		
		
		
		/*
		### Exercise 9: Simple Interest Calculation
		Ask the user to enter principal amount, rate of interest, and time (in years). Calculate and print the simple interest using the formula: `simple interest = (principal * rate * time) / 100`.
		*/
		/*
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("write the amount");
		int amount = scanner.nextInt();
		
		System.out.println("write the rate of the interest ");
		int rateInterest = scanner.nextInt();
		
		System.out.println("write the years");
		int years = scanner.nextInt();
		
		int interest = (amount * rateInterest * years) / 100;
		
		System.out.println("Interest " + interest);
		*/
		
		/*
		### Exercise 10: BMI Calculator
		Ask the user to enter their weight (in kilograms) and height (in meters). Calculate and print their Body Mass Index (BMI) using the formula: `BMI = weight / (height * height)`.
		*/
		/*
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("write your weight in kg");
		 double weight = scanner.nextInt();
		 
		 System.out.println("write your height in meters");
		 double height = scanner.nextDouble();
		 
		 double BMI = weight / (height * height);
		 
		 System.out.println("Your BMI is " + BMI);
		 scanner.close();
		 */
	}

}
