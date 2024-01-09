package abstractionAssignment;

public class FamilySuite extends HotelBooking{
private int rateOfSuite=230;

public FamilySuite(String typeOfSuite, boolean hasMeals,String customerName, int daysOfStay, int numberOfAdults, int numberOfKids){
	super(typeOfSuite, hasMeals, customerName, daysOfStay, numberOfAdults, numberOfKids);
	
}
	
@Override
	public void passRates() {
		roomRate=rateOfSuite;
	}

}
