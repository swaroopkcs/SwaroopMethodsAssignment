package part2Question2;

public class CustomerService {
	String name = "John";
	String email = "john@gmail.com";
	String address = "100 queen street";
	String getName() {
		return name;
	}
	String getEmail() {
		return email;
	}
	String getAddress() {
		return address;
	}
	void setName(String newName) {
		name =newName;
	}
	void setEmail(String newEmail) {
		email = newEmail;
	}
	void setAddress (String newAddress) {
		address = newAddress;
	}

}
