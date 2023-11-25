package Assignment24Nov2023;

import java.util.Scanner;

public class mobilePhone {

	/*
	 * Part 1 : Write a program which when given a phone brand name, shows all the
	 * available products present in that category. Please use the below table to
	 * create list of products for each category. Part 2: After displaying all the
	 * available products, ask user to enter one product name. Ensure user enters
	 * one of the displayed names. If user enters a name which is present in list,
	 * print “product selected is : name of product “ otherwise display an error
	 * message – “Please select a product from the list”
	 * 
	 * Samsung Google Apple S20 Google Pixel 6 Iphone12 S21 Google Pixel 6 Pro
	 * Iphone SE Flip3 Google Pixel Pro Iphone 15 Fold3 Google Pixel 5 Iphone 13
	 */

	void searchMobilePhones() {
		String[] samsung = { "S20", "S21", "Flip3", "Fold3" };
		String[] google = { "Pixel 6", "Pixel 6 Pro", "Pixel Pro", "Pixel 5" };
		String[] apple = { "Iphone 12", "Iphone SE", "Iphone 15", "Iphone 13" };
		String brand;
		String model;
		String[] selectedModel = null;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the mobile phone brand name: ");
		brand = scan.nextLine();
		boolean flag=false;
		boolean flag2=false;

		if (brand.equals("samsung")) {
			System.out.println("The models are: ");
			selectedModel = samsung;
			flag=true;
			for (int i = 0; i < samsung.length; i++) {
				System.out.println(samsung[i]);
			}
		}

		else if (brand.equals("google")) {
			System.out.println("The models are: ");
			selectedModel = google;
			flag=true;
			for (int i = 0; i < google.length; i++) {
				System.out.println(google[i]);
			}
		} else if (brand.equals("apple")) {
			System.out.println("The models are: ");
			selectedModel = apple;
			flag=true;
			for (int i = 0; i < apple.length; i++) {
				System.out.println(apple[i]);

			}
		} else {
			System.out.println("Brand not available");
		}
if(flag) {
		System.out.println("Enter the model name from the list: ");
		model = scan.nextLine();

		for (int j = 0; j < 4; j++) {
			if (model.equals(selectedModel[j])) {
				System.out.println("Product selected is " + selectedModel[j]);
				flag2=true;
				break;
			} 
			
		}
		if(!flag2) {
			System.out.println("Please select a product from the list");
		}
		scan.close();
	}
	}

}
