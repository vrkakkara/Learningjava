package Assignment07Dec2023;
import java.util.Scanner;
public class MainPizza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int flag=0;
		String size="null";
		Pizza pizza=new Pizza();
		while (flag==0) {
		System.out.println("Please enter the size of your pizza (S/M/L): ");
		size=scan.next();
		if(size.equals("S")||size.equals("M")||size.equals("L")) {
			flag=1;
		}
		else {
			flag=0;
		}
		}
		System.out.println("Do you need additional pepperoni topping(true/false): ");
		boolean topping=scan.nextBoolean();
		System.out.println("Do you need additional cheese(true/false): ");
		boolean cheese=scan.nextBoolean();
		
		if(size.equals("S")) {
			int price=15;
			pizza.pizzaBill(size,price,topping, cheese);
		}
		else if(size.equals("M")) {
			int price=20;
			pizza.pizzaBill(size,price,topping, cheese);
		}
		else if(size.equals("L")) {
			int price=25;
			pizza.pizzaBill(size,price,topping, cheese);
		}

System.out.println("Your final bill amount is: "+pizza.bill);

	}

}
