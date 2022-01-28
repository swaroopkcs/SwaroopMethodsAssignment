package calculator;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String continueChoice = "";
		CalculatorOperations cOperations = new CalculatorOperations();
		double finalResult = 0.0;
		do {
			System.out.println("Please enter the operation that you want to perform: ");
			System.out.println("Press +, -, * or /");
			String choice = sc.next();
			System.out.println("Please enter the first number: ");
			double number1 = sc.nextDouble();
			System.out.println("Please enter the second number: ");
			double number2 = sc.nextDouble();
			switch (choice) {
			case "+":
				finalResult = cOperations.AddNumbers(number1, number2);
				break;
			case "-":
				finalResult = cOperations.subtractNumbers(number1, number2);
				break;
			case "*":
				finalResult = cOperations.multiplyNumbers(number1, number2);
				break;
			case "/":
				finalResult = cOperations.divideNumbers(number1, number2);
				break;
			default:
				System.out.println("Please enter a valid operation: ");
			}
			System.out.println("The result of the operation is: " + finalResult);
			System.out.println("Please press Y to continue using the calculator. Press anywhere else to exit.");
			continueChoice = sc.next();
		} while (continueChoice.equals("Y")||continueChoice.equals("y"));
		System.out.println("Thank you for using the calculator");
		sc.close();
	}

}
