package abstractionAssignment;

public class MysteryCruise extends CruiseBooking {
	private double adultDailyRate=45.99;
	private double childDailyRate=12.99;
	private int days=2;
	private String nameOfCruise="Mystery Cruise";
	private double RateOfService=20;
	
	
	
	public MysteryCruise( boolean hasService,boolean hasFood, String customerName, int numberOfAdults,
			int numberOfBigKids) {
		super(hasService,hasFood, customerName, numberOfAdults, numberOfBigKids);
		adultRate=adultDailyRate;
		childRate=childDailyRate;
		numberOfDays=days;
		typeOfcruise=nameOfCruise;
		serviceRate=RateOfService;
	}
	

	
//	@Override
//	public void passRates() {
//		adultRate=adultDailyRate;
//		childRate=childDailyRate;
//		numberOfDays=days;
//		typeOfcruise=nameOfCruise;
//		serviceRate=RateOfService;
//	}
	
	
	
	
}
