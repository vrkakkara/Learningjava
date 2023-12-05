package Assignment30Nov2023;

import java.util.Scanner;
/*Write a simple Java program which will print Fibonacci series,
e.g. 1 1 2 3 5 8 13 ... . up to a given number.*/
public class Fibonacci {
	

	void fibonacciSeries() {
		Scanner scan = new Scanner(System.in);
		int lengthOfSeries;
		System.out.println("Enter the size of the fibonacci series: ");
		lengthOfSeries = scan.nextInt();
		int[] fibonacciNumbers = new int[lengthOfSeries];

		

		fibonacciNumbers[0] = 0;
		fibonacciNumbers[1] = 1;

		for (int i = 2; i < lengthOfSeries; i++) {
			fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
		}
		System.out.println("The fibonacci series for the entrered size is ");
		for (int i = 0; i < lengthOfSeries; i++) {
			System.out.println(fibonacciNumbers[i]);
		}

	}
}