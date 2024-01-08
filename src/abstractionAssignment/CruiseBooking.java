package abstractionAssignment;

import java.util.Scanner;

public class CruiseBooking extends MyBookings{
	
	
	String typeOfcruise;
	double adultRate;
	double childRate;
	int numberOfDays;
	double adultFoodPrice=20.99;
	double childFoodPrice=4.99;
	int bigChildren;
	
	
	boolean hasFood;
	
	String customerName;
	int numberOfAdults;
	int numberOfBigKids;
	
	

	public void setNumberOfAdults(int numberOfAdults) {
		this.numberOfAdults = numberOfAdults;
	}

	public void setNumberOfBigKids(int numberOfBigKids) {
		this.numberOfBigKids = numberOfBigKids;
	}
//Parameterized constructor which takes parameter values from corresponding child class
	
	
	//blank non parameterized constructor
	public CruiseBooking() {
		
	}

	
	public CruiseBooking( boolean hasFood, String customerName, int numberOfAdults,
		int numberOfBigKids) {
	super();
	
	this.hasFood = hasFood;
	this.customerName = customerName;
	this.numberOfAdults = numberOfAdults;
	this.numberOfBigKids = numberOfBigKids;
}

	//Final bill calculation- Common method for all the cruises
	public double calculateCost() {
		double grandTotal;
		double buffetAdults = 0;
		double buffetKids = 0;
		double adultFare = numberOfAdults * adultRate*numberOfDays;
		double childFare = numberOfBigKids * childRate*numberOfDays;
		if (hasFood) {
			buffetAdults = numberOfAdults * adultFoodPrice*numberOfDays;
			buffetKids = numberOfBigKids * childFoodPrice*numberOfDays;
		} else {
			buffetAdults = numberOfAdults * 0;
			buffetKids = numberOfBigKids * 0;
		}
		double totalFare = adultFare + childFare + buffetAdults + buffetKids;
		double hst = totalFare * 0.15;
		grandTotal = totalFare + hst;
		System.out.println("You have selected "+typeOfcruise);
		System.out.println("Your package includes: ");
		System.out.println("Cruise Adults @" + numberOfAdults + " : " + adultFare);
		System.out.println("Cruise Kids above age 5 @" + numberOfBigKids + " : " + childFare);
		System.out.println("Buffet Special Price Adults @" + numberOfAdults + " : " + buffetAdults);
		System.out.println("Buffet Special Price Kids above age 5 @" + numberOfBigKids + " : " + buffetKids);
		System.out.println("Buffet Special Price Kids above age 5 @" + numberOfBigKids + " : " + buffetKids);
		System.out.println("Total price is: " + totalFare);
		System.out.println("HST @15%: " + hst);
		System.out.println("Final price is: " + grandTotal);
		return grandTotal;
	}

	
	
	//Method to find number of children of desired age and return that number
	public int childrenDetails(int numberOfChildren) {
int[] childrenAge = new int[numberOfChildren];
		
Scanner scan = new Scanner(System.in);
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
		return bigChildren;
	}
	public void cruiseDetails(String cruiseType) {
		

		if (cruiseType.equals("1")) {

			System.out.println(
					"The cruise that you have selected is Scenic Cruise which is a 3 day cruise\nPrice for Adults(greater than 12)is $43.99\nPrice for kids above age 5 is $12.99\nKids below age 5 is free\n");

		} else if (cruiseType.equals("2")) {
			System.out.println(
					"The cruise that you have selected is Sunset Cruise which is a 1 day cruise\nPrice for Adults(greater than 12)is $52.99\nPrice for kids above age 5 is $15.99\nKids below age 5 is free\n");

		}

		else if (cruiseType.equals("3")) {
			System.out.println(
					"The cruise that you have selected is Discovery Cruise which is a 4 day cruise\nPrice for Adults(greater than 12)is $39.99\nPrice for kids above age 5 is $9.99\nKids below age 5 is free");

		}

		else if (cruiseType.equals("4")) {
			System.out.println(
					"The cruise that you have selected is Mystery Cruise which is a 2 day cruise\nPrice for Adults(greater than 12)is $45.99\nPrice for kids above age 5 is $12.99\nKids below age 5 is free");

		}

	}

	
}
