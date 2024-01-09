package abstractionAssignment;

public class SunsetCruise extends CruiseBooking {
	private double adultDailyRate=52.99;
	private double childDailyRate=15.99;
	private int days=1;
	private String nameOfCruise="Sunset Cruise";
	private double RateOfService=20;


		
	public SunsetCruise( boolean hasService,boolean hasFood, String customerName, int numberOfAdults,
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
