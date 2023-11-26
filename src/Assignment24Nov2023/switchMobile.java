package Assignment24Nov2023;

import java.util.Scanner;

public class switchMobile {
	void searchPhones() {
		String[] samsung = { "S20", "S21", "Flip3", "Fold3" };
		String[] google = { "Pixel 6", "Pixel 6 Pro", "Pixel Pro", "Pixel 5" };
		String[] apple = { "Iphone 12", "Iphone SE", "Iphone 15", "Iphone 13" };
		String brand;
		String model;
		String[] selectedModel = null;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the mobile phone brand name: ");
		brand = scan.nextLine();
		boolean flag = false;
		boolean flag2 = false;

		switch (brand) {
		case ("samsung"):
			System.out.println("The models are: ");
			selectedModel = samsung;
			flag = true;
			for (int i = 0; i < samsung.length; i++) {
				System.out.println(samsung[i]);
			}
		case ("google"):
			System.out.println("The models are: ");
			selectedModel = google;
			flag = true;
			for (int i = 0; i < google.length; i++) {
				System.out.println(google[i]);
			}

		case ("apple"):
			System.out.println("The models are: ");
			selectedModel = apple;
			flag = true;
			for (int i = 0; i < apple.length; i++) {
				System.out.println(apple[i]);

			}
		default:
			System.out.println("Brand not available");

			if (flag) {
				System.out.println("Enter the model name from the list: ");
				model = scan.nextLine();

				for (int j = 0; j < 4; j++) {
					if (model.equals(selectedModel[j])) {
						System.out.println("Product selected is " + selectedModel[j]);
						flag2 = true;
						break;
					}

				}
				if (!flag2) {
					System.out.println("Please select a product from the list");
				}
				scan.close();
			}
		}

	}

}
