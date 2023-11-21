package Assignment16Nov23;
import java.util.InputMismatchException;
import java.util.Scanner;
public class WaterTank {

	void waterTank() {
		// TODO Auto-generated method stub
		
		int waterInTank;
		int initialCapacity;
		int maxCapacity=90;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter current total of water in the tank: ");
		initialCapacity = scan.nextInt();

		for (int i = initialCapacity; i < maxCapacity; i += 10) {

			waterInTank = i + 10;
			System.out.println("Total litres of water in tank is " + waterInTank);

		}

		System.out.println("The tank is full, please turn off the pump and save water");

	}

}
