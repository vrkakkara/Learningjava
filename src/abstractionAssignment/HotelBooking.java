package abstractionAssignment;

public class HotelBooking extends MyBookings{
	
	
	public String typeOfSuite;
	public boolean hasMeals;
	public String customerName;
	public int daysOfStay;
	public int numberOfAdults;
	public int numberOfKids;
	public double roomRate;
	private double lunchRateAdult=25;
	private double lunchRateKid=5;
	private double grandTotalCost;
	private double tax=0.18;
	private double roomCost;
	private double adultLunchCost;
	private double kidslunchCost;
	private double totalCost;
	
	public HotelBooking() {}
	
	public HotelBooking(String typeOfSuite, boolean hasMeals,String customerName, int daysOfStay, int numberOfAdults, int numberOfKids) {
		super();
		this.typeOfSuite=typeOfSuite;
		this.hasMeals=hasMeals;
		this.customerName = customerName;
		this.daysOfStay = daysOfStay;
		this.numberOfAdults = numberOfAdults;
		this.numberOfKids = numberOfKids;
	}

	@Override
	public double calculateCost() {
		
	
		
		if(hasMeals) {
			adultLunchCost=numberOfAdults*lunchRateAdult;
			kidslunchCost=numberOfKids*lunchRateKid;
					}
		else if(!hasMeals) {
			adultLunchCost=0;
			kidslunchCost=0;
		}
	
		roomCost=daysOfStay*roomRate;
		totalCost=roomCost+adultLunchCost+kidslunchCost;
		grandTotalCost=totalCost*(1+tax);
        System.out.println("The total amount you will be charged is:\n"+typeOfSuite+"        @"+daysOfStay+" nights: "+roomCost);
		
		System.out.println("Lunch Pre-Booked Special Rate Adults	@  "+numberOfAdults+" is: "+ adultLunchCost);
		System.out.println("Lunch Pre-Booked Special Rate Adults	@  "+numberOfKids+" is: "+ kidslunchCost);
		System.out.println("Total price is: "+totalCost);
		System.out.println("Total price with 18% tax is : "+grandTotalCost);
		return grandTotalCost;
	}
	@Override
	public void passRates() {
		
	}
	//Pass these values from mainclass
	
	

	
	
	
	
	
	

}
