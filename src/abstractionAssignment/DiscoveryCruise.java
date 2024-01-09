package abstractionAssignment;

public class DiscoveryCruise extends CruiseBooking{
	private double adultDailyRate=39.99;
	private double childDailyRate=9.99;
	private int days=4;
	String nameOfCruise="Discovery Cruise";
	private double RateOfService=20;
	
	
	public DiscoveryCruise( boolean hasService,boolean hasFood, String customerName, int numberOfAdults,
			int numberOfBigKids) {
		super(hasService,hasFood, customerName, numberOfAdults, numberOfBigKids);
		adultRate = adultDailyRate;
		childRate = childDailyRate;
		numberOfDays = days;
		typeOfcruise = nameOfCruise;
		serviceRate = RateOfService;
	}
	

	
	/*
	 * @Override public void passRates() { adultRate=adultDailyRate;
	 * childRate=childDailyRate; numberOfDays=days; typeOfcruise=nameOfCruise;
	 * 
	 * }
	 */


	

}
