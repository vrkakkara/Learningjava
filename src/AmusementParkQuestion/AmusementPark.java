package AmusementParkQuestion;



public class AmusementPark {
	
	
	int EnterHeight;
	public static void main(String[] args) {
		
		AmusementPark entry=new AmusementPark();
		entry.EnterHeight=120; //The height will be entered by the park authority here
		
		if(entry.EnterHeight>=90&&entry.EnterHeight<=200) {    //condition is established so that people between the height limit of 90 to 200cm can enter the park
			
			System.out.println("You can enter the park");
		}
		else {
			System.out.println("You are not eligible to enter the park");
		}
	}

	

}
