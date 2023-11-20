package Assignment16Nov23;

import java.util.Scanner;

public class MainParkRide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		ParkRide rider = new ParkRide();

		while (rider.numberOfPersons < 10) {

			System.out.println("Please enter height of the person");
			rider.height = scan.nextInt();

			if (rider.height > 90 && rider.height < 200) {

				rider.numberOfPersons++;
				System.out.println("The total people on ride is " + rider.numberOfPersons);
			} else {
				System.out.println("This person is not eligible to take the ride");
				System.out.println("Total number of people on ride is " + rider.numberOfPersons);

			}
		}

		System.out.println("The ride is full, please wait for next trip");
		scan.close();
	}

}
