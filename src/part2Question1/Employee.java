package part2Question1;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		EmployeeFirstName eFirstName = new EmployeeFirstName();
		System.out.println("Please enter the First name of the Employee: ");
		eFirstName.firstName = sc.next();
		String firstName = eFirstName.getEmployeeName();
		EmployeeLastName employeeLastName = new EmployeeLastName();
		System.out.println("Please enter the Last name of the Employee: ");
		employeeLastName.employeeLastName = sc.next();
		String lastName = employeeLastName.getEmployeeLastName();
		EmployeeHourlyRate eHourlyRate = new EmployeeHourlyRate();
		System.out.println("Please enter the hourly rate of the Employee: ");
		eHourlyRate.employeeHourlyRate = sc.nextDouble();
		double hourlyRate = eHourlyRate.gethourlyRate();
		System.out.println("The name of the employee is: "+firstName+" "+lastName);
		System.out.println("The hourly rate of the employee is: "+hourlyRate);
		System.out.print("Please enter the new first name for the employee: ");
		String newFirstName = sc.next();
		eFirstName.setEmplName(newFirstName);
		String newFName = eFirstName.getEmployeeName();
		System.out.print("Please enter the new last name for the employee: ");
		String newLastName = sc.next();
		employeeLastName.setEmplName(newLastName);
		String newLName = employeeLastName.getEmployeeLastName();
		System.out.print("Please enter the new hourly for the employee: ");
		double newRate = sc.nextDouble();
		eHourlyRate.sethourlyRate(newRate);;
		double newHRate = eHourlyRate.gethourlyRate();
		System.out.println("Please enter the hours that the employee worked this week: ");
		double hours = sc.nextDouble();
		WeeklySalary weeklySalary = new WeeklySalary();
		System.out.println("The updated name of the Employee is: "+newFName+" "+newLName);
		System.out.println("The new hourly pay for the employee is: "+ newHRate);
		weeklySalary.weeklySalary(newHRate, hours);
	}

}
