package abstractionAssignment;

import java.util.Scanner;

public class BookingMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String email;
		String createdPassword;
		String customerName;
		String phoneNumber;
		
		String roomType = "";
		int numberOfAdults = 0;
		int numberOfChildren = 0;
		boolean rightNumber = true;
		boolean hasLunch = false;
		int numberOfDays;
		String typeOfSuite = null;
		String choice = "";
		String cruiseNumber = null;
		int bigChildren;
		boolean wantsFood = false;
		String service = null;
		boolean bookAnother = true;

		// Taking customer sign up details
		System.out.println("Welcome to Cruise and Hotel Booking.\n\nPlease sign up to book a cruise/room.\n");
		System.out.println("Enter your email address. (This will be your future username): ");
		email = scan.nextLine();
		System.out.println("Enter your password: ");
		createdPassword = scan.nextLine();
		System.out.println("Enter your Full Name:  ");
		customerName = scan.nextLine();
		System.out.println("Enter your phone number: ");
		phoneNumber = scan.nextLine();
		System.out.println("Thank you for registering!!\n\n\n");
		System.out.println("_____________________________________________");

		// passing user details to userInfotmation class
		UserInformation user = new UserInformation(email, createdPassword, phoneNumber, customerName);
        
		while(bookAnother) {
			String bookingChoice = "0";
		//User selecting cruise or Hotel
		while (!(bookingChoice.equals("1")) && !(bookingChoice.equals("2"))) {
			System.out.println("Please select the service you want to book. \n1.Hotel room or \n2.Cruise\n\n\n");

			bookingChoice = scan.next();
			if ((Integer.valueOf(bookingChoice) < 1) || (Integer.valueOf(bookingChoice) > 2)) {
				System.out.println("Please try entering a valid input (1 or 2)");
			}
		}

		
		//For Hotel Booking
		if (bookingChoice.equals("1")) {
			
			//Selecting type of room
			while (!roomType.equals("1") && !roomType.equals("2")) {
				System.out.println(
						"We offer 2 types of rooms.\n1. Deluxe Suite: Accomodates 2 adults and 2 children and rate is $180/night\n2. Family Suite: Accomodates 4 adults and 4 children at $230/night\n Please enter corresponding number to choose your prefered suite.");
				roomType = scan.next();
				if (!(roomType.equals("1")) && !(roomType.equals("2"))) {
					System.out.println("Please try entering a valid input (1 or 2)");
				}

			}
			
			//Checking if user needs lunch

			System.out.println(
					"All rooms come with free breakfast. Do you want to add lunch in your room as well at a discounted pre-booking rate of $25/ adult and $5/ child. If you need lunch press Y or press any other button");
			String needBreakfast = scan.next();
			if (needBreakfast.equalsIgnoreCase("Y")) {
				hasLunch = true;   //hasLunch to save food is needed or not
			} else {
				hasLunch = false;
			}
			System.out.println("Enter number of days of stay: ");
			numberOfDays = scan.nextInt();    //to get number of days of stay
			HotelBooking booking = new HotelBooking();    

			// For Deluxe Suite
			if (roomType.equals("1")) {
				typeOfSuite = "Deluxe Suite";
				while (rightNumber) {
					System.out.println("Enter number of adults: ");
					numberOfAdults = scan.nextInt();
					System.out.println("Enter number of Kids (below age 12): ");
					numberOfChildren = scan.nextInt();

					
					//checking if number of people are valid
					if (numberOfAdults > 2 || numberOfChildren > 2) {
						System.out.println(
								"room is not suitable for the number of guests please select again or select separate rooms one at a time.");
						System.out.println("\n\n\n\n\n");
					}

					else {
						rightNumber = false;
					}

				}
				booking = new DeluxeSuite(typeOfSuite, hasLunch, customerName, numberOfDays, numberOfAdults,
						numberOfChildren);  //Assigning the object of HotelBooking with child class constructor

			}

			// For Family Suite
			else if (roomType.equals("2")) {
				typeOfSuite = "Family Suite";
				while (rightNumber) {
					System.out.println("Enter number of adults: ");
					numberOfAdults = scan.nextInt();

					System.out.println("Enter number of Kids (below age 12): ");
					numberOfChildren = scan.nextInt();

					if (numberOfAdults > 4 || numberOfChildren > 4) {
						System.out.println(
								"Room is not suitable for the number of guests please select again or select separate rooms one at a time.");
					} else {
						rightNumber = false;
					}

				}
				booking = new FamilySuite(typeOfSuite, hasLunch, customerName, numberOfDays, numberOfAdults,
						numberOfChildren); //Assigning the object of HotelBooking with child class constructor

			}

			booking.passRates();  //invoking method inside the child(Suite) class to pass the daily rates
			booking.calculateCost();   //invoking method of Hotelbooking to calculate the total
			System.out.println("\n\n\n\n\n");

		}
		if (bookingChoice.equals("2")) {
			CruiseBooking cruise = new CruiseBooking();
			while (!choice.equalsIgnoreCase("Y")) {
				System.out.println(
						"We offer 4 different packages as displayed below.\nPlease enter the cruise that you want to select.\n1. Scenic Cruise\n2. Sunset Cruise\n3. Discovery Cruise\n4. Mystery Cruise\n");

				cruiseNumber = scan.next();
				System.out.println("\n\n\n\n\n");
				while ((Integer.valueOf(cruiseNumber) < 1) || Integer.valueOf(cruiseNumber) > 4) {
					System.out.println("Please enter valid cruise number: ");
					cruiseNumber = scan.next();

				}
				cruise.cruiseDetails(cruiseNumber);
				System.out.println(
						"Please press Y if you want to continue with the selection or press any other alphabet to select another\n");
				choice = scan.next();

			}

			// To take dynamic input for total passengers including kids

			System.out.println("Please enter the number of adults(above age 12): ");
			numberOfAdults = scan.nextInt();

			System.out.println("Please enter the number of children(below age 12): ");

			// method in cruise class to find number of children between age 6 and 12
			numberOfChildren = scan.nextInt();

			bigChildren = cruise.childrenDetails(numberOfChildren);

			System.out.println("Total number of children require a ticket is " + bigChildren + "\n");
			System.out.println("\n\n\n\n\n");

			// method in cruise class to find if customers want to include food onboard

			System.out.println(
					"All our cruises have food service on board.\nDo you want to pre-book for dinner buffet meals at 20.99 per day for adults and 4.99 per day for kids?\nPress Y to include food onboard and N to skip");

			String food = scan.next();
			while ((!food.equalsIgnoreCase("Y")) && (!food.equalsIgnoreCase("N"))) {
				System.out.println("Enter valid input (Y or N)");
				food = scan.next();
				System.out.println("\n\n\n\n\n");
			}
			if (food.equalsIgnoreCase("Y")) {
				wantsFood = true;
			}

			else {
				wantsFood = false;
			}

			boolean needService=false;
			// To calculate the bill as per the type of cruise using an object initialized
			if (cruiseNumber.equals("1")) {
				System.out.println("Please click Y, if you like to add SPA to your order for $50 per person OR Press any key");
				service=scan.next();
				if(service.equalsIgnoreCase("Y")) {
					needService=true;
				}
				cruise = new ScenicCruise(needService,wantsFood, customerName, numberOfAdults, bigChildren);

			} else if (cruiseNumber.equals("2")) {
				System.out.println("Please click Y, if you like to add candle light dinner for $45/person OR Press any key");
				service=scan.next();
				if(service.equalsIgnoreCase("Y")) {
					needService=true;
				}
				cruise = new SunsetCruise(needService,wantsFood, customerName, numberOfAdults, bigChildren);

			} else if (cruiseNumber.equals("3")) {
				System.out.println("Please click Y, if you like to add candle light dinner for $45/person OR Press any key");
				service=scan.next();
				if(service.equalsIgnoreCase("Y")) {
					needService=true;
				}
				cruise = new DiscoveryCruise(needService,wantsFood, customerName, numberOfAdults, bigChildren);

			} else if (cruiseNumber.equals("4")) {
				System.out.println("Please click Y, if you like to add casino for $$20/ person OR Press any key");
				service=scan.next();
				if(service.equalsIgnoreCase("Y")) {
					needService=true;
				}
				cruise = new MysteryCruise(needService,wantsFood, customerName, numberOfAdults, bigChildren);

			}

			cruise.passRates();
			cruise.calculateCost();
			System.out.println("\n\n\n\n\n");

		}
		
		String anotherBooking;
		System.out.println("Do you want to make another booking? If Yes, press Y. Press any other alphabet to exit.");
		anotherBooking = scan.next();
		if(anotherBooking.equalsIgnoreCase("Y")) {
			bookAnother = true;
		}
		else {
			bookAnother = false;
		}
		}
		
		// Prompt to see if user wants to change personal information
		String editInfo;

		System.out.println(
				"Do you want to change your personal information. Press Y to change. Press any other alphabet to exit.");
		String itemToChange = null;
		editInfo = scan.next();
		boolean isValid = true;

		if (editInfo.equalsIgnoreCase("Y")) {
			while (isValid) {
				System.out.println(
						"Please enter the information you want to change.\n1. Password\n2. Phone number\n3. Email");
				itemToChange = scan.next();
				System.out.println("\n\n\n\n\n");
				if (itemToChange.equals("1") || itemToChange.equals("2") || itemToChange.equals("3")) {
					isValid = false;
				} else {
					isValid = true;
				}

			}

		} else {
			System.out.println("Thank you for booking the cruise. Enjoy your ride.");
		}

		// Taking dynamic input from user to validate username and password
		int numberOfAttempts = 0;
		String enteredUsername = null;
		String enteredPassword = null;
		String newPassword;
		String newUsername;
		String newPhoneNumber;

		while ((numberOfAttempts < 3) && (!isValid)) {
			System.out.println("Enter the current Username: ");
			enteredUsername = scan.next();
			System.out.println("Enter the current Password: ");
			enteredPassword = scan.next();

			// Validating credentials using method in cruiseDetails class+invoking method to
			// reset password
			if (user.validateCredentials(enteredPassword, enteredUsername) && itemToChange.equals("1")) {
				System.out.println("Enter new Password: ");
				newPassword = scan.next();
				user.setPassword(newPassword);
				System.out.println("hi " + customerName + " your password is reset. Thank you for booking with us.");
				isValid = true;
				// System.out.println(user.getPassword());

			}

			// Validating credentials using method in cruiseDetails class+invoking method to
			// reset phone number
			else if (user.validateCredentials(enteredPassword, enteredUsername) && itemToChange.equals("2")) {
				System.out.println("Enter new Phone number: ");
				newPhoneNumber = scan.next();
				user.setPhoneNumber(newPhoneNumber);
				System.out
						.println("hi " + customerName + " your phone number is reset. Thank you for booking with us.");
				// numberOfAttempts = 100;
				isValid = true;
				// System.out.println(user.getPhoneNumber());
			}

			// Validating credentials using method in cruiseDetails class+invoking method to
			// reset username
			else if (user.validateCredentials(enteredPassword, enteredUsername) && itemToChange.equals("3")) {
				System.out.println("Enter new Username/email: ");
				newUsername = scan.next();
				user.setUsername(newUsername);
				System.out.println("hi " + customerName + " your email is reset. Thank you for booking with us.");
				// numberOfAttempts = 100;
				isValid = true;
				// System.out.println(user.getUsername());
			}

			else {
				System.out.println("Invalid credentials. Please try again\n\n\n");
				numberOfAttempts++;
			}
		}

		// Blocking the user from further inputs after 3 unsuccessful tries
		if (numberOfAttempts == 3) {
			System.out.println(
					"You have reached your maximum number of attempts. Please try again after 24 hours. Thank you.");
		}

	}
}
