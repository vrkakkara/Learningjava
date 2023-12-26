package cruiseAssignment;

import java.util.Scanner;

public class Cruise {

	public double finalBill(int numberOfAdults, int numberOfChildren, boolean hasFood) {
		double grandTotal;
		double buffetAdults = 0;
		double buffetKids = 0;
		double adultFare = numberOfAdults * 43.99;
		double childFare = numberOfChildren * 12.99;
		if (hasFood) {
			buffetAdults = numberOfAdults * 20.99;
			buffetKids = numberOfChildren * 4.99;
		} else {
			buffetAdults = numberOfAdults * 0;
			buffetKids = numberOfChildren * 0;
		}
		double totalFare = adultFare + childFare + buffetAdults + buffetKids;
		double hst = totalFare * 0.15;
		grandTotal = totalFare + hst;
		System.out.println("Your package includes: ");
		System.out.println("Cruise Adults @" + numberOfAdults + " : " + adultFare);
		System.out.println("Cruise Kids above age 5 @" + numberOfChildren + " : " + childFare);
		System.out.println("Buffet Special Price Adults @" + numberOfAdults + " : " + buffetAdults);
		System.out.println("Buffet Special Price Kids above age 5 @" + numberOfChildren + " : " + buffetKids);
		System.out.println("Buffet Special Price Kids above age 5 @" + numberOfChildren + " : " + buffetKids);
		System.out.println("Total price is: " + totalFare);
		System.out.println("HST @15%: " + hst);
		System.out.println("Final price is: " + grandTotal);
		return grandTotal;
	}

	public void cruiseDetails(String cruiseType) {
		String rightChoice; 
		Scanner scan = new Scanner(System.in);
		
		if (cruiseType.equals("1")) {
			
				System.out.println(
						"The cruise that you have selected is Scenic Cruise which is a 3 day cruise\nPrice for Adults(greater than 12)is $43.99\nPrice for kids above age 5 is $12.99\nKids below age 5 is free\n");

				
			}
				else if (cruiseType.equals("2")) {
				System.out.println(
						"The cruise that you have selected is Sunset Cruise which is a 1 day cruise\nPrice for Adults(greater than 12)is $52.99\nPrice for kids above age 5 is $15.99\nKids below age 5 is free\n");
				
				}

				else if (cruiseType.equals("3")) {
				System.out.println(
						"The cruise that you have selected is Discovery Cruise which is a 4 day cruise\nPrice for Adults(greater than 12)is $39.99\nPrice for kids above age 5 is $9.99\nKids below age 5 is free");
				
				}

				
				else if (cruiseType.equals("4")) 
				{ System.out.println("The cruise that you have selected is Mystery Cruise which is a 2 day cruise\nPrice for Adults(greater than 12)is $45.99\nPrice for kids above age 5 is $12.99\nKids below age 5 is free"
				  ); 
			
		}
		//To t
	}
}
