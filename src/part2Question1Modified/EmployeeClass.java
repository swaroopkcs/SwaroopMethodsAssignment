package part2Question1Modified;

import java.util.Scanner;

public class EmployeeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		EmployeeData employeeData = new EmployeeData();
		// Getting the values for the First name, Last name and Hourly Rate
		System.out.println("Please enter the first name of the Employee: ");
		employeeData.firstName = sc.next();
		String firstName = employeeData.getEmployeeFirstName();
		System.out.println("Please enter the last name of the employee: ");
		employeeData.employeeLastName = sc.next();
		String lastName = employeeData.getEmployeeLastName();
		System.out.println("Please enter the hourly pay for the employee: ");
		employeeData.empHourlyRate = sc.nextDouble();
		double hourlyRate = employeeData.gethourlyRate();
		System.out.println("The name of the employee is: " + firstName + " " + lastName);
		System.out.println("The hourly rate for the employee is: " + hourlyRate);
		// Updating the values
		System.out.println("Please enter the new first name for the employee: ");
		String newFirstName = sc.next();
		employeeData.setEmplFirstName(newFirstName);
		System.out.println("Please enter the new last name for the employee: ");
		String newLastName = sc.next();
		employeeData.setEmplLastName(newLastName);
		System.out.println("Please enter the new hourly rate for the employee: ");
		double newHourlyRate = sc.nextDouble();
		employeeData.sethourlyRate(newHourlyRate);
		// Getting the new values
		String newFName = employeeData.getEmployeeFirstName();
		String newLName = employeeData.getEmployeeLastName();
		double newHrlyRate = employeeData.gethourlyRate();
		System.out.println("Please enter the hours that the employee worked this week: ");
		double weeklyHours = sc.nextDouble();
		System.out.println("The new name for the employee is: " + newFName + " " + newLName);
		System.out.println("The hourly rate for the employee is updated to: " + newHrlyRate);
		employeeData.weeklySalary(weeklyHours);

	}

}
