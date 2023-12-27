package cruiseAssignmentPart2;

public class UserInformation {

	private String username;
	private String password;
	public String phoneNumber;
	public String customerName;

	public UserInformation(String username, String password, String phoneNumber, String customerName) {
		super();
		this.username = username;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.customerName = customerName;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public boolean validateCredentials(String enteredPassword, String enteredUsername) {
		boolean isValidCredentials = false;
		if (enteredPassword.equals(this.password) && enteredUsername.equals(this.username)) {
			isValidCredentials = true;
			return isValidCredentials;

		} else {
			isValidCredentials = false;
			return isValidCredentials;
		}

	}

	public void setPassword(String newPassword) {

		this.password = newPassword;

	}

	public void setUsername(String newUsername) {

		this.username = newUsername;

	}

	public void setPhoneNumber(String newPhoneNumber) {

		this.phoneNumber = newPhoneNumber;

	}
}
