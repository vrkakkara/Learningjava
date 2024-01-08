package abstractionAssignment;

public class MysteryCruise extends CruiseBooking {
	double adultDailyRate=45.99;
	double childDailyRate=12.99;
	int days=2;
	String nameOfCruise="Mystery Cruise";
	
	
	
	public MysteryCruise( boolean hasFood, String customerName, int numberOfAdults,
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
