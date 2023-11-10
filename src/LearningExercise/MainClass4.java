package LearningExercise;

public class MainClass4 {
	
	public static void main(String[] args) {
		ThrottleFuel entry1=new ThrottleFuel();
		
		entry1.x=50;
		
		
		if(entry1.x<=127) {
			
			entry1.y=entry1.x*2;
			
		}
		
		if(entry1.x>127) {
			entry1.y=entry1.x+127;
		}
		
		System.out.println("Y Fuel value is "+entry1.y);
	}

}
