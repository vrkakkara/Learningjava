package Assignment30Nov2023;
//Write a program to print the numbers in an array in descending order.
//Write a program to find the maximum number in an array.
//Write a program to sort an array of number.
//Write a Java Program to find the second-highest number in an array.
import java.util.Scanner;

public class MasterProgram {
	 
	int lengthOfList;
	int[] numberList;
	int[] dummyList;

	void populate() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the total number of entries in your list: ");
		lengthOfList = scan.nextInt();
		numberList = new int[lengthOfList];
		dummyList = new int[lengthOfList];
		System.out.println("Enter the numbers: ");

		for (int i = 0; i < lengthOfList; i++) {
			numberList[i] = scan.nextInt();
		}
	}
	void sort() {
		for (int j=0;j<lengthOfList-1;j++) {
			for(int k=j+1;k<lengthOfList;k++) {
				if(numberList[j]>numberList[k]) {
					dummyList[j]=numberList[k];
					numberList[k]=numberList[j];
					numberList[j]=dummyList[j];
				}
				
			}
		}
	
	}
	void printSort() {
		System.out.println("The numbers sorted in ascending order is: ");
		for (int l = 0; l < lengthOfList; l++) {
			System.out.println(numberList[l]);
		}
	}
	void secondLargest() {
		System.out.println(" The second highest number is: "+numberList[1]);
	}
	void descending() {
		System.out.println("The numbers sorted in descending order is: ");
		for (int l = (lengthOfList-1); l >= 0; l--) {
			System.out.println(numberList[l]);
		}
	}
	void maximumNumber() {
		System.out.println(" The maximum number is: "+numberList[(lengthOfList-1)]);
	}
	
}
