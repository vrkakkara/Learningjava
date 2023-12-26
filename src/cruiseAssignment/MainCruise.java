package cruiseAssignment;

import java.util.Scanner;

public class MainCruise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		boolean isRightCruise = true;
		String cruiseType=null;
		String rightChoice = null;
		boolean wantsFood=false;
		int numberOfAdults;
		int bigChildren=0;
		Cruise cruise=new Cruise();
		// Giving Cruise information
		System.out.println(
				"We offer 4 different packages as displayed below.\nPlease enter the cruise that you want to select.\n1. Scenic Cruise\n2. Sunset Cruise\n3. Discovery Cruise\n4. Mystery Cruise\n");
		while (isRightCruise) {

			System.out.println("Please enter the corresponding number to choose the cruise type");
			cruiseType = scan.next();
			if (cruiseType.equals("1")) {
			//case 1:
				System.out.println(
						"The cruise that you have selected is Scenic Cruise which is a 3 day cruise\nPrice for Adults(greater than 12)is $43.99\nPrice for kids above age 5 is $12.99\nKids below age 5 is free\n");

				System.out.println(
						"Please press Y if you want to continue with the selection or press any other alphabet to select another\n");
				rightChoice = scan.next();
				if (rightChoice.equalsIgnoreCase("Y")) {
					isRightCruise = false;
				} else {
					isRightCruise = true;
				}
			}
				else if (cruiseType.equals("2")) {
				System.out.println(
						"The cruise that you have selected is Sunset Cruise which is a 1 day cruise\nPrice for Adults(greater than 12)is $52.99\nPrice for kids above age 5 is $15.99\nKids below age 5 is free\n");
				System.out.println(
						"Please press Y if you want to continue with the selection or press any other alphabet to select another\n");
				rightChoice = scan.next();
				if (rightChoice.equalsIgnoreCase("Y")) {
					isRightCruise = false;
				} else {
					isRightCruise = true;
				}
				}

				else if (cruiseType.equals("3")) {
				System.out.println(
						"The cruise that you have selected is Discovery Cruise which is a 4 day cruise\nPrice for Adults(greater than 12)is $39.99\nPrice for kids above age 5 is $9.99\nKids below age 5 is free");
				System.out.println(
						"Please press Y if you want to continue with the selection or press any other alphabet to select another\n");
				rightChoice = scan.next();
				if (rightChoice.equalsIgnoreCase("Y")) {
					isRightCruise = false;
				} else {
					isRightCruise = true;
				}
				}

				
				else if (cruiseType.equals("4")) 
				{ System.out.println("The cruise that you have selected is Mystery Cruise which is a 2 day cruise\nPrice for Adults(greater than 12)is $45.99\nPrice for kids above age 5 is $12.99\nKids below age 5 is free"
				  ); 
				System.out.println(
				  "Please press Y if you want to continue with the selection or press any other alphabet to select another\n"
				  ); rightChoice = scan.next(); if (rightChoice.equalsIgnoreCase("Y")) {
				  isRightCruise = false; } else { isRightCruise = true; }
				}
			
				
				else { 
				isRightCruise=true;

			}

		}
		//To take dynamic input for total passengers including kids
		
		System.out.println("Please enter the number of adults: ");
		numberOfAdults=scan.nextInt();
		System.out.println("Please enter the number of children: ");
		int numberOfChildren=scan.nextInt();
		int[] childrenAge=new int[numberOfChildren];
		boolean isValidFoodInput=true;
		
		//Array to take ages of children
		for(int i=0;i<numberOfChildren;i++) {
			System.out.println("Age of the child "+(i+1)+" is:");
			childrenAge[i]=scan.nextInt();
			}
		
		//Checking total number of kids above age 5
		for(int j=0;j<numberOfChildren;j++) {
			if(childrenAge[j]>5) {
				bigChildren++;
			}
		}
		
		System.out.println("Total number of children require a ticket is "+bigChildren+"\n");
		//To check whether customer needs food or not
		System.out.println("All our cruises have food service on board.\nDo you want to pre-book for dinner buffet meals at 20.99 per day for adults and 4.99 per day for kids?\nPress Y to include food onboard and N to skip");
		
		String food=scan.next();
		while(isValidFoodInput) {
			if(food.equalsIgnoreCase("Y")) {
				wantsFood=true;
				isValidFoodInput=false;
			}
			else if(food.equalsIgnoreCase("N")) {
				wantsFood=false;
				isValidFoodInput=false;
			}
			else {
				isValidFoodInput=true;
			}
		}
		//To calculate the bill as per the type of cruise	
	if(cruiseType.equals("1"))	{
		cruise=new ScenicCruise();
		cruise.finalBill(numberOfAdults, bigChildren, wantsFood);
		
	}
		
	if(cruiseType.equals("2"))	{
		cruise=new SunsetCruise();
		cruise.finalBill(numberOfAdults, bigChildren, wantsFood);
		
	}
	if(cruiseType.equals("3"))	{
		cruise=new DiscoveryCruise();
		cruise.finalBill(numberOfAdults, bigChildren, wantsFood);
		}	
	if(cruiseType.equals("4"))	{
	    cruise=new MysteryCruise();
		cruise.finalBill(numberOfAdults, bigChildren, wantsFood);
		
	}
	

	}

}
