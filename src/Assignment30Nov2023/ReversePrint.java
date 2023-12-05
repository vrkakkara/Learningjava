package Assignment30Nov2023;
/*Write a program to reverse array in place i.e reverse the elements of an 
array without using any other array.*/
import java.util.Scanner;

public class ReversePrint {
	void reverse() {
		int lengthOfList;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the total number of entries in your list: ");
		lengthOfList = scan.nextInt();
		int[] numberList = new int[lengthOfList];
		System.out.println("Enter the numbers" + "; ");
		
		
		for (int i = 0; i < lengthOfList; i++) {
			numberList[i] = scan.nextInt();
		}
	
		
		
		System.out.println("The sequence in reverse is: ");
		for(int j=(lengthOfList-1);j>=0;j--) {
			System.out.println(numberList[j]);
		}
	}
}
