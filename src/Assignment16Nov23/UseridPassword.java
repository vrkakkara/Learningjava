package Assignment16Nov23;
import java.util.Scanner;
public class UseridPassword {
	void credentialsInput() {

	String originalUserid = "pivotAdmin";
	String originalPassword = "Admin123";
	int numberOfAttempts;
	String userid;
	String password;

	
	
	Scanner scan = new Scanner(System.in);
	for (numberOfAttempts = 0; numberOfAttempts < 3; numberOfAttempts++) {

		System.out.println("Please enter the userID ");
		userid = scan.next();
		System.out.println("Please enter the Password ");
		password = scan.next();

		if (userid.equals(originalUserid) && password.equals(originalPassword)) {

			System.out.println("Total number of attempts " + (numberOfAttempts + 1));
			System.out.println("You are logged in to the application");
			break;
		} else {
			// entry.numberOfAttempts++;
			System.out.println("Total number of attempts " + (numberOfAttempts + 1));
			System.out.println("Incorrect User id or password.Try again");
		}

	}

	if (numberOfAttempts >= 3) {
		System.out.println("Account locked");

	}

	scan.close();
	
}
}
