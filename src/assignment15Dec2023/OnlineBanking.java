package assignment15Dec2023;
import java.util.Scanner;
public class OnlineBanking extends BankOperations{
	PersonalDetails personaldetails=new PersonalDetails();
	Scanner scan = new Scanner(System.in);
	/*Creating a method to verify the entered account details, and return true
	  if entered values are valid*/
	
	boolean accountVerification() {
		
		String enteredUsername=null;
		boolean isVerified=false;
		int flag2=0;
		String enteredPassword=null;
		while(flag2==0) {
		System.out.println("Enter Username: ");
		enteredUsername=scan.nextLine();
		System.out.println("Enter password: ");
		enteredPassword=scan.nextLine();
		if((enteredUsername.equals(personaldetails.getUsername()))&&(enteredPassword.equals(personaldetails.getPassword()))) { 
			flag2=1;
		isVerified=true;
		}
			
		}
		return isVerified;
		
	}
	
	
	
	
}
