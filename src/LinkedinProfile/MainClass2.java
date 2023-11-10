package LinkedinProfile;

import java.security.PublicKey;

public class MainClass2 {
	public static void main(String[] args) {
		//The below lin eis assigning the type to person1, LHS of = means person1 is an object
		//of type personal information which is defined in the previous class named personal information
		//RHS is saying you are creating a oject cakled person1 which is a new type
		//of personal information
		//   Classname name = new Classname(); - Creating an object of a Class
		PersonalInformation person1=new PersonalInformation();
		
		person1.name="Vishnu";
		person1.age=34;
		person1.address="80Acorn";
		person1.percentile=8;
		person1.printInfo();
		
		PersonalInformation person2=new PersonalInformation();
		person2.name="Dwarakesh";
		person2.percentile=9;
		person2.printInfo();
		
		
		
		
		
		
	}
}
