package part2Question2;

import java.util.Scanner;

public class CustomerServiceUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		CustomerService cService = new CustomerService();
		String name = cService.getName();
		String email = cService.getEmail();
		String address = cService.getAddress();
		System.out.println("The name of Customer is: " + name);
		System.out.println("The email address for the customer is: " + email);
		System.out.println("The address for the customer is: " + address);
		System.out.println("Please press Y to update the details of the customer");
		System.out.println("Please press N to exit");
		String choice = sc.next();
		switch (choice) {
		case "Y":
			System.out.println("Please enter the new name for the customer: ");
			String name1 = sc.next();
			cService.setName(name1);
			String newName = cService.getName();
			System.out.println("Please enter the new email for the customer: ");
			String email1 = sc.next();
			cService.setEmail(email1);
			String newemail = cService.getEmail();
			System.out.println("Please enter the new address for the customer: ");
			String address1 = sc.next();
			cService.setAddress(address1);
			String newAddress = cService.getAddress();
			System.out.println("Please see the new details for the customer");
			System.out.println("Name: " + newName);
			System.out.println("Email: " + newemail);
			System.out.println("Address: " + newAddress);
			break;
		case "N":
			System.out.println("Thank you for using Customer Service");
			break;
		default:
			System.out.println("Please enter a valid choice.");
		}

	}

}
