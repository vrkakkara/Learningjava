package abstractionAssignment;

public class ScenicCruise extends CruiseBooking {
	
	double adultDailyRate=43.99;
	double childDailyRate=12.99;
	int days=3;
	String nameOfCruise="Scenic Cruise";
	
	
	
	public ScenicCruise( boolean hasFood, String customerName, int numberOfAdults,
			int numberOfBigKids) {
		super(hasFood, customerName, numberOfAdults, numberOfBigKids);
		// TODO Auto-generated constructor stub
	}
	

	
	@Override
	public void passRates() {
		adultRate=adultDailyRate;
		childRate=childDailyRate;
		numberOfDays=days;
		typeOfcruise=nameOfCruise;
	
	}


	/*
	 * public ScenicCruise() { super(43.99, 12.99, 3); // TODO Auto-generated
	 * constructor stub }
	 */

}
