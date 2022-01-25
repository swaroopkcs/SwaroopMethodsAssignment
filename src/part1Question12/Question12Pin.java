package part1Question12;

import java.util.Scanner;

public class Question12Pin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PinSelected pinSelected = new PinSelected();
		pinSelected.pin = 4567;
		int intialPin = pinSelected.getInitialPin();
		System.out.println("the initial PIN on your account is: "+intialPin);
		System.out.println("Please enter a new PIn to continue: ");
		Scanner sc = new Scanner (System.in);
		int newPin = sc.nextInt();
		pinSelected.setPin(newPin);
		int selectedNewPin = pinSelected.getInitialPin();
		System.out.println("The new PIN selected is: "+selectedNewPin);
	}

}
