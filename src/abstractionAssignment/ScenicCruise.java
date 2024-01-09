package abstractionAssignment;

public class ScenicCruise extends CruiseBooking {

	private double adultDailyRate = 43.99;
	private double childDailyRate = 12.99;
	private int days = 3;
	private String nameOfCruise = "Scenic Cruise";
	private double RateOfService = 20;

	public ScenicCruise(boolean hasService, boolean hasFood, String customerName, int numberOfAdults,
			int numberOfBigKids) {
		super(hasService, hasFood, customerName, numberOfAdults, numberOfBigKids);
		adultRate = adultDailyRate;
		childRate = childDailyRate;
		numberOfDays = days;
		typeOfcruise = nameOfCruise;
		serviceRate = RateOfService;
	}

	/*
	 * public void passRates() { adultRate=adultDailyRate; childRate=childDailyRate;
	 * numberOfDays=days; typeOfcruise=nameOfCruise;
	 * 
	 * }
	 */

	

	/*
	 * public ScenicCruise() { super(43.99, 12.99, 3); // TODO Auto-generated
	 * constructor stub }
	 */

}