package abstractionAssignment;

public abstract class MyBookings {
	
	public String typeOfSuite;
	public boolean hasMeals;
	public String customerName;
	public int daysOfStay;
	public int numberOfAdults;
	public int numberOfKids;
	
	
	public abstract double calculateCost();


	public void passRates() {
		// TODO Auto-generated method stub
		
	}

}