package LearningExercise;

public class MainClass3 {
	public static void main(String[] args) {

		FuelInjection entry=new FuelInjection();
		entry.xThrottle=130;
				
		if(entry.xThrottle<=127) {
			entry.yFuel=entry.xThrottle*2;
		}
	if(entry.xThrottle>127) {
		
		entry.yFuel=entry.xThrottle+127;
		
	}
	
	System.out.println("The fuel injection value is "+entry.yFuel);
	
	
	
}
}