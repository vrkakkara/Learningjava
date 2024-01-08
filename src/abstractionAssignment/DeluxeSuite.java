package abstractionAssignment;

public class DeluxeSuite extends HotelBooking{
	private int rateOfSuite=180;
	
	public DeluxeSuite(String typeOfSuite, boolean hasMeals,String customerName, int daysOfStay, int numberOfAdults, int numberOfKids){
		super(typeOfSuite, hasMeals, customerName, daysOfStay, numberOfAdults, numberOfKids);
	}
	
	@Override
	public void passRates() {
		roomRate=rateOfSuite;
	}

}
