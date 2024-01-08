package abstractionAssignment;

public class SunsetCruise extends CruiseBooking {
	double adultDailyRate=52.99;
	double childDailyRate=15.99;
	int days=1;
	String nameOfCruise="Sunset Cruise";
	
	
	
	public SunsetCruise( boolean hasFood, String customerName, int numberOfAdults,
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
	
	
	





}
