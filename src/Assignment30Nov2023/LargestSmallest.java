package Assignment30Nov2023;
//Write a program to find smallest and largest number in an array.
import java.util.Scanner;

public class LargestSmallest {
	int lengthOfList;
	int[] numberList;

	void populate() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the total number of entries in your list: ");
		lengthOfList = scan.nextInt();
		numberList = new int[lengthOfList];
		System.out.println("Enter the numbers: ");

		for (int i = 0; i < lengthOfList; i++) {
			numberList[i] = scan.nextInt();
		}
	}

	void smallest() {
		int i=0;

		
			for (int j = i+1; j < numberList.length; j++) {
				if (numberList[0]>(numberList[j])) {
					numberList[0]=numberList[j];
										}

			}

		
		
			System.out.println("Smallest number is "+numberList[0]);
		
	}
	
	void highest() {
		int i=0;

		
		for (int j = i+1; j < numberList.length; j++) {
			if (numberList[0]<(numberList[j])) {
				numberList[0]=numberList[j];
									}

	}
		System.out.println("And the highest number is "+numberList[0]);
}
}


