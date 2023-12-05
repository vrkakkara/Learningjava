package Assignment30Nov2023;
import java.util.Scanner;
//Write a program to find if the number is prime or not.
public class prime {
	void primeNumber() {
	
		
		
	Scanner scan = new Scanner(System.in);
	double number;
	int flag=0;
	System.out.println("Enter the number: ");
	number =scan.nextDouble();
	
	for (int i=2;i<number;i++) {
		if(number%i==0&&flag==0) {
			flag++;
		}
	}
	if(flag==0)	{
		System.out.println("The number is a prime number");
	}
	else {
		System.out.println("The number is not a prime number");
	}
		
	}
	
		}
	
