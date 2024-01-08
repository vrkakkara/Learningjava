package abstractionAssignment;

import java.util.Scanner;
public class BookingMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String email;
		String createdPassword;
		String customerName;
		String phoneNumber;
		String bookingChoice="0";
		String roomType="";
		int numberOfAdults=0;
		int numberOfChildren=0;
		boolean rightNumber=true;
		boolean hasLunch=false;
		int numberOfDays;
		String typeOfSuite=null;
		HotelBooking booking=new HotelBooking();
	// Taking customer sign up details
				System.out.println("Welcome to Cruise and Hotel Booking.\n\nPlease sign up to book a cruise/room.\n");
				System.out.println("Enter your email address. (This will be your future username): ");
				email = scan.nextLine();
				System.out.println("Enter your password: ");
				createdPassword = scan.nextLine();
				System.out.println("Enter your Full Name:  ");
				customerName = scan.nextLine();
				System.out.println("Enter your phone number: ");
				phoneNumber = scan.nextLine();
		        System.out.println("Thank you for registering!!");
				
		        
		        //passing user details to userInfotmation class
		        UserInformation user = new UserInformation(email, createdPassword, phoneNumber, customerName);
				
		        while(!(bookingChoice.equals("1"))&&!(bookingChoice.equals("2"))) {
		        System.out.println("Please select the service you want to book. \n1.Hotel room or \n2.Cruise");
		        
		        bookingChoice=scan.next();
		        if((Integer.valueOf(bookingChoice)<1)||(Integer.valueOf(bookingChoice)>2)) {
		        	System.out.println("Please try entering a valid input (1 or 2)");
		        }
		        }
		        
		        if(bookingChoice.equals("1")) {
		        	while(!roomType.equals("1")&&!roomType.equals("2")) {
		        	System.out.println("We offer 2 types of rooms.\n1. Deluxe Suite: Accomodates 2 adults and 2 children and rate is $180/night\n2. Family Suite: Accomodates 4 adults and 4 children at $230/night\n Please enter corresponding number to choose your prefered suite.");
		        	roomType=scan.next();
		        	 if(!(roomType.equals("1"))&&!(roomType.equals("2"))) {
				        	System.out.println("Please try entering a valid input (1 or 2)");
				        }
		        	
		        }
		        	
		        	System.out.println("All rooms come with free breakfast. Do you want to add lunch in your room as well at a discounted pre-booking rate of $25/ adult and $5/ child. If you need lunch press Y or press any other button");
		        	String needBreakfast=scan.next();
		        	if(needBreakfast.equals("Y")) {
		        		hasLunch=true;
		        	}
		        	else {
		        		hasLunch=false;
		        	}
		        	System.out.println("Enter number of days of stay: ");
		        	numberOfDays=scan.nextInt();
		        	
		        	//For Deluxe Suite
		        	if(roomType.equals("1")) {
		        	typeOfSuite="Deluxe Suite";
		        	while(rightNumber) {	
		        	System.out.println("Enter number of adults: ");
		        	numberOfAdults=scan.nextInt();
		        	System.out.println("Enter number of Kids (below age 12): ");
		        	numberOfChildren=scan.nextInt();
		        	if(numberOfAdults>2||numberOfChildren>2) {
		        		System.out.println("room is not suitable for the number of guests please select again or select separate rooms one at a time.");
		        	}
		        	else {
		        		rightNumber=false;
		        	}
		        		
		        	}
		        	HotelBooking hotelBooking=new HotelBooking(typeOfSuite, hasLunch, customerName, numberOfDays, numberOfAdults, numberOfChildren);
		        	booking=new DeluxeSuite();
		        	
		        	}
		        	
		        	//For Family Suite
		        	else if(roomType.equals("2")) {
		        		typeOfSuite="Family Suite";	
		        	while(rightNumber) {	
		        	System.out.println("Enter number of adults: ");
		        	numberOfAdults=scan.nextInt();
		        	System.out.println("Enter number of Kids (below age 12): ");
		        	numberOfChildren=scan.nextInt();
		        	if(numberOfAdults>4||numberOfChildren>4) {
		        		System.out.println("Room is not suitable for the number of guests please select again or select separate rooms one at a time.");
		        	}
		        	else {
		        		rightNumber=false;
		        	}
		        		
		        	}
		        	HotelBooking hotelBooking=new HotelBooking(typeOfSuite, hasLunch, customerName, numberOfDays,  numberOfAdults, numberOfChildren);
		        	booking=new FamilySuite();
		        
		        	}
		        	//public HotelBooking(String typeOfSuite, boolean hasMeals,String customerName, int daysOfStay, int numberOfAdults, int numberOfKids) 
		        	//HotelBooking hotelBooking=new HotelBooking(typeOfSuite, hasLunch, customerName, numberOfChildren, numberOfAdults, numberOfDays);
		        	booking.passRoomRate();
		        	booking.calculateCost();


		        }

}
}
