package abstractionAssignment;

public class DiscoveryCruise extends CruiseBooking{
	double adultDailyRate=39.99;
	double childDailyRate=9.99;
	int days=4;
	String nameOfCruise="Discovery Cruise";
	
	
	
	public DiscoveryCruise( boolean hasFood, String customerName, int numberOfAdults,
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
