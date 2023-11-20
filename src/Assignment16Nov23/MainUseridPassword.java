package Assignment16Nov23;

import java.util.Scanner;

public class MainUseridPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UseridPassword entry = new UseridPassword();
		Scanner scan = new Scanner(System.in);
		for (entry.numberOfAttempts = 0; entry.numberOfAttempts < 3; entry.numberOfAttempts++) {

			System.out.println("Please enter the userID ");
			entry.userid = scan.next();
			System.out.println("Please enter the Password ");
			entry.password = scan.next();

			if (entry.userid.equals(entry.originalUserid) && entry.password.equals(entry.originalPassword)) {

				System.out.println("Total number of attempts " + (entry.numberOfAttempts + 1));
				System.out.println("You are logged in to the application");
				break;
			} else {
				// entry.numberOfAttempts++;
				System.out.println("Total number of attempts " + (entry.numberOfAttempts + 1));
				System.out.println("Incorrect User id or password.Try again");
			}

		}

		if (entry.numberOfAttempts >= 3) {
			System.out.println("Account locked");

		}

		scan.close();
	}

}
