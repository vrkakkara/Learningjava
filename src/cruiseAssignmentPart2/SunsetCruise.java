package cruiseAssignmentPart2;

public class SunsetCruise extends Cruise {
	@Override
	public double finalBill(int numberOfAdults, int numberOfChildren, boolean hasFood) {
		double grandTotal;
		double buffetAdults = 0;
		double buffetKids = 0;
		double adultFare = numberOfAdults * 52.99;
		double childFare = numberOfChildren * 15.99;
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
		System.out.println("Sunset Cruise Adults @" + numberOfAdults + " : " + adultFare);
		System.out.println("Sunset Cruise Kids above age 5 @" + numberOfChildren + " : " + childFare);
		System.out.println("Buffet Special Price Adults @" + numberOfAdults + " : " + buffetAdults);
		System.out.println("Buffet Special Price Kids above age 5 @" + numberOfChildren + " : " + buffetKids);
		System.out.println("Buffet Special Price Kids above age 5 @" + numberOfChildren + " : " + buffetKids);
		System.out.println("Total price is: " + totalFare);
		System.out.println("HST @15%: " + hst);
		System.out.println("Final price is: " + grandTotal);
		return grandTotal;
	}

}
