package assignment15Dec2023;

import java.util.Scanner;

public class MainBanking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String modeOfTransaction=null;
		String typeOftransaction;
		int flag = 0;
		int flag1=0;
		int flag3=0;
		ATM atm = new ATM();
		OnlineBanking onlinebanking = new OnlineBanking();
		Scanner scan2 = new Scanner(System.in);
		/*Requesting preferred mode of transaction*/
		while (flag1 == 0) {
		System.out.println("Please enter the preferred mode of transaction(ATM/Online Banking): ");
		modeOfTransaction = scan2.nextLine();
		if((modeOfTransaction.equalsIgnoreCase("ATM"))||modeOfTransaction.equalsIgnoreCase("Online Banking")) {
			flag1=1;
		}
		}
		/*Invoking method in ATM class to verify the entered values*/
		if (modeOfTransaction.equalsIgnoreCase("ATM")) {
			boolean status=atm.pinVerification();
			/*Invoking method to withdraw/deposit if the returned value is true*/
				if (status) {
				while (flag == 0) {
					System.out.println("Please enter the type of transaction (withdaw/deposit): ");
					typeOftransaction = scan2.nextLine();
					if (typeOftransaction.equalsIgnoreCase("withdraw")) {
						flag = 1;
						atm.withdraw();
					}
					else if (typeOftransaction.equalsIgnoreCase("deposit")) {
						flag = 2;
						atm.deposit();
					}

				}

			}

		}
		else if(modeOfTransaction.equalsIgnoreCase("Online Banking")) {
			//boolean status=onlinebanking.accountVerification();
			/*Invoking method in OnlineBanking class to verify the entered values*/
			/*And Invoking method to withdraw/deposit if the returned value is true*/
			if(onlinebanking.accountVerification()) {
				while(flag3==0) {
					System.out.println("Please type the type of transaction (withdaw/deposit): ");
					typeOftransaction = scan2.nextLine();
					if (typeOftransaction.equalsIgnoreCase("withdraw")) {
						flag3 = 1;
						onlinebanking.withdraw();
					}
					else if(typeOftransaction.equalsIgnoreCase("deposit")) {
						flag3 = 2;
						onlinebanking.deposit();
					}
				}
			}
		}
	}
}