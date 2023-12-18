package assignment15Dec2023;
import java.util.Scanner;
public class ATM extends BankOperations{
	
	
	PersonalDetails personaldetails=new PersonalDetails();
	Scanner scan1 = new Scanner(System.in);
	/*Creating a method to verify the entered pin and account number, and return true
	 * if entered values are valid*/
	 
	boolean pinVerification() {
		String enteredAccountNumber;
		boolean isVerified=false;
		int flag=0;
		int enteredPin=0;
		while(flag==0) {
		System.out.println("Enter account number: ");
		enteredAccountNumber=scan1.nextLine();
		System.out.println("Enter pin number: ");
		enteredPin=scan1.nextInt();
		if(enteredAccountNumber.equals(personaldetails.accountNumber)&&enteredPin==personaldetails.getPin()) { 
			flag=1;
		isVerified=true;
		}
			
		}
		return isVerified;
	}
}



