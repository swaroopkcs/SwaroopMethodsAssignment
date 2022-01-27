package part2Question1Modified;

public class EmployeeData {
	String firstName = "";
	String employeeLastName = "";
	double empHourlyRate = 0;

	String getEmployeeFirstName() {
		return firstName;
	}

	void setEmplFirstName(String newFirstName) {
		firstName = newFirstName;
	}

	String getEmployeeLastName() {
		return employeeLastName;
	}

	void setEmplLastName(String newLastName) {
		employeeLastName = newLastName;
	}

	double gethourlyRate() {
		return empHourlyRate;
	}

	void sethourlyRate(double newRate) {
		empHourlyRate = newRate;
	}

	void weeklySalary(double hoursWorked) {
		double weekSalary = empHourlyRate * hoursWorked;
		System.out.println("The salary of the employee is: " + weekSalary);
	}
}
