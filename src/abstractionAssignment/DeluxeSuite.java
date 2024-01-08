package abstractionAssignment;

public class DeluxeSuite extends HotelBooking{
	private int rateOfSuite=180;
	
	@Override
	public void passRoomRate() {
		roomRate=rateOfSuite;
	}

}
