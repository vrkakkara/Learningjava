package AndOrProblem;

public class MainClassAndOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnginePerformance input1=new EnginePerformance();
		input1.x=50;
		input1.engineTemp=130;
		
		if(input1.x>0&&input1.x<=127&&input1.isEngineCool) {
			input1.y=input1.x*2;
		}
		
		if(input1.x>127&&input1.x<=256&&input1.isEngineCool) {
			input1.y=input1.x+127;
		}
		else  {
			System.out.println("Please turn off the engine");
		}
		
System.out.println("The value of Y is "+input1.y);
	}
}
