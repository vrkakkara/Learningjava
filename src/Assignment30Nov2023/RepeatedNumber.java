package Assignment30Nov2023;
/*Write a program to find repeated numbers in an array 
if it contains multiple duplicates  */    
import java.util.Scanner;

public class RepeatedNumber {
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

	void repeat() {
		int flag = 0;
		System.out.println("The repeated number(s) is/are: ");

		for (int i = 0; i < numberList.length-1; i++) {
			for (int j = i+1; j < numberList.length; j++) {
				if (numberList[i]==(numberList[j])) {
					System.out.println(numberList[j]);
					flag++;
					break;

				}

			}

		}
		if(flag==0) {
		System.out.println("No repeating numbers");
		}
	}
}
