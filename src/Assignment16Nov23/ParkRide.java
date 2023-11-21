package Assignment16Nov23;

import java.util.Scanner;

public class ParkRide {
void amusementParkRide() {
	int height;
	int numberOfPersons = 0;
	
	Scanner scan = new Scanner(System.in);
	
	while (numberOfPersons < 10) {

		System.out.println("Please enter height of the person");
		height = scan.nextInt();
		
		
   

		if (height > 90 && height < 200) {

			numberOfPersons++;
			System.out.println("The total people on ride is " + numberOfPersons);
		} else {
			System.out.println("This person is not eligible to take the ride");
			System.out.println("Total number of people on ride is " + numberOfPersons);

		}
	}

	System.out.println("The ride is full, please wait for next trip");
	scan.close();
}

}
