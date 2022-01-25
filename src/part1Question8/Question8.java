package part1Question8;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Question8Addition question8Addition = new Question8Addition();
		Question8Subtraction question8Subtraction = new Question8Subtraction();
		System.out.println("Please enter the first number: ");
		int number1 = sc.nextInt();
		System.out.println("Please enter the second number: ");
		int number2 = sc.nextInt();
		System.out.println("Please enter the operation that you want to peform: Type Add or Subtract");
		String choice = sc.next();
		switch(choice) {
		case "Add":
			question8Addition.addition(number1, number2);
			break;
		case "Subtract":
			question8Subtraction.subtraction(number1, number2);
			break;
		default:
			System.out.println("Please enter a valid operation");
		}

	}

}
