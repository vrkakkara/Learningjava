package assignment15Dec2023;
import java.util.Scanner;
public class BankOperations {
	Scanner scan = new Scanner(System.in);
	PersonalDetails personaldetails=new PersonalDetails();
	double currentBalance;
	void withdraw() {
		double withdrawal=0;
		System.out.println("Please enter the amount you want to withdraw: ");
		withdrawal=scan.nextDouble();
		currentBalance=personaldetails.accountBalance-withdrawal;
		personaldetails.accountBalance=currentBalance;
		System.out.println("The available balance in your account is: "+personaldetails.accountBalance);
		
	}
	void deposit() {
		double deposit=0;
		System.out.println("Please enter the amount you want to deposit: ");
		deposit=scan.nextDouble();
		currentBalance=personaldetails.accountBalance+deposit;
		personaldetails.accountBalance=currentBalance;
		System.out.println("The available balance in your account is: "+personaldetails.accountBalance);
	}
}
