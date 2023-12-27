package cruiseAssignmentPart2;

import java.util.Scanner;

public class MainCruise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean isRightCruise = true;
		String cruiseType = null;
		String rightChoice = null;
		boolean wantsFood = false;
		int numberOfAdults;
		int bigChildren = 0;
		String email = null;
		String createdPassword = null;
		String customerName = null;
		String phoneNumber = null;
		String editInfo = null;
		String newPassword = null;
		String newUsername = null;
		String newPhoneNumber = null;
		int numberOfAttempts = 0;
		String enteredUsername=null;
		String enteredPassword=null;
		Cruise cruise = new Cruise();
		
		
		// Taking customer sign up details
		System.out.println("Welcome to Cruise Booking.\n\nPlease sign up to book a cruise.\n");
		System.out.println("Enter your email address. (This will be your future username): ");
		email = scan.nextLine();
		System.out.println("Enter your password: ");
		createdPassword = scan.nextLine();
		System.out.println("Enter your Full Name:  ");
		customerName = scan.nextLine();
		System.out.println("Enter your phone number: ");
		phoneNumber = scan.nextLine();
		
		
		// Giving Cruise information
		UserInformation user = new UserInformation(email, createdPassword, phoneNumber, customerName);

		System.out.println(
				"We offer 4 different packages as displayed below.\nPlease enter the cruise that you want to select.\n1. Scenic Cruise\n2. Sunset Cruise\n3. Discovery Cruise\n4. Mystery Cruise\n");
		while (isRightCruise) {

			System.out.println("Please enter the corresponding number to choose the cruise type");
			cruiseType = scan.next();
			if (cruiseType.equals("1") || cruiseType.equals("2") || cruiseType.equals("3") || cruiseType.equals("4")) {

				// invoking method in cruise class to display different options and prices
				cruise.cruiseDetails(cruiseType);

				System.out.println(
						"Please press Y if you want to continue with the selection or press any other alphabet to select another\n");
				rightChoice = scan.next();
				if (rightChoice.equalsIgnoreCase("Y")) {
					isRightCruise = false;
				} else {
					isRightCruise = true;
				}
			}

		}
		
		
		// To take dynamic input for total passengers including kids

		System.out.println("Please enter the number of adults(above age 12): ");
		numberOfAdults = scan.nextInt();
		System.out.println("Please enter the number of children(below age 12): ");
		int numberOfChildren = scan.nextInt();
		int[] childrenAge = new int[numberOfChildren];
		boolean isValidFoodInput = true;

		
		
		// Array to take ages of children
		for (int i = 0; i < numberOfChildren; i++) {
			System.out.println("Age of the child " + (i + 1) + " is:");
			childrenAge[i] = scan.nextInt();
		}

		
		
		// Checking total number of kids above age 5
		for (int j = 0; j < numberOfChildren; j++) {
			if (childrenAge[j] > 5) {
				bigChildren++;
			}
		}

		System.out.println("Total number of children require a ticket is " + bigChildren + "\n");
		
		
		
		// To check whether customer needs food or not

		while (isValidFoodInput) {
			System.out.println(
					"All our cruises have food service on board.\nDo you want to pre-book for dinner buffet meals at 20.99 per day for adults and 4.99 per day for kids?\nPress Y to include food onboard and N to skip");

			String food = scan.next();

			if (food.equalsIgnoreCase("Y")) {
				wantsFood = true;
				isValidFoodInput = false;
			} else if (food.equalsIgnoreCase("N")) {
				wantsFood = false;
				isValidFoodInput = false;
			} else {
				isValidFoodInput = true;
			}
		}
		
		
		// To calculate the bill as per the type of cruise
		if (cruiseType.equals("1")) {
			cruise = new ScenicCruise();
			cruise.finalBill(numberOfAdults, bigChildren, wantsFood);

		}

		if (cruiseType.equals("2")) {
			cruise = new SunsetCruise();
			cruise.finalBill(numberOfAdults, bigChildren, wantsFood);

		}
		if (cruiseType.equals("3")) {
			cruise = new DiscoveryCruise();
			cruise.finalBill(numberOfAdults, bigChildren, wantsFood);
		}
		if (cruiseType.equals("4")) {
			cruise = new MysteryCruise();
			cruise.finalBill(numberOfAdults, bigChildren, wantsFood);

		}

		
		// Prompt to see if user wants to change personal information
		System.out.println(
				"Do you want to change your personal information. Press Y to change. Press any other alphabet to exit.");
		String itemToChange = null;
		editInfo = scan.next();
		boolean isValid = true;

		if (editInfo.equalsIgnoreCase("Y")) {
			while (isValid) {
				System.out.println("Please enter the information you want to change.\n1. Password\n2. Phone number\n3. Email");
				itemToChange = scan.next();
				if (itemToChange.equals("1") || itemToChange.equals("2") || itemToChange.equals("3")) {
					isValid = false;
				} 
				else {
					isValid = true;
				}

			}
			
		}
		else {
			System.out.println("Thank you for booking the cruise. Enjoy your ride.");
		}
		
		
		// Taking dynamic input from user to validate username and password
		while ((numberOfAttempts < 3)&&(!isValid)) {
			System.out.println("Enter the current Username: ");
			enteredUsername = scan.next();
			System.out.println("Enter the current Password: ");
			enteredPassword = scan.next();
			
			
			// Validating credentials using method in cruiseDetails class+invoking method to reset password
			if (user.validateCredentials(enteredPassword, enteredUsername) && itemToChange.equals("1")) {
				System.out.println("Enter new Password: ");
				newPassword = scan.next();
				user.setPassword(newPassword);
				System.out.println("hi "+customerName+" your password is reset. Thank you for booking with us.");
                numberOfAttempts=100;
                //System.out.println(user.getPassword());

			} 
			
			
			// Validating credentials using method in cruiseDetails class+invoking method to reset phone number
			else if (user.validateCredentials(enteredPassword, enteredUsername) && itemToChange.equals("2")) {
				System.out.println("Enter new Phone number: ");
				newPhoneNumber = scan.next();
				user.setPhoneNumber(newPhoneNumber);
				System.out.println("hi "+customerName+" your phone number is reset. Thank you for booking with us.");
				numberOfAttempts=100;
				System.out.println(user.getPhoneNumber());
			} 
			
			// Validating credentials using method in cruiseDetails class+invoking method to reset username
			else if (user.validateCredentials(enteredPassword, enteredUsername) && itemToChange.equals("3")) {
				System.out.println("Enter new Username/email: ");
				newUsername = scan.next();
				user.setUsername(newUsername);
				System.out.println("hi "+customerName+" your email is reset. Thank you for booking with us.");
				numberOfAttempts=100;
				//System.out.println(user.getUsername());
			}

			else {
				numberOfAttempts++;
			}
		}
		
		// Blocking the user from further inputs after 3 unsuccessful tries
		if(numberOfAttempts==3) {
			System.out.println("You have reached your maximum number of attempts. Please try again after 24 hours. Thank you.");
		}
		
	}

}
