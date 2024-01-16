package missionMars;
import java.util.ArrayList;
import java.util.Scanner;
public class MissionMain {

	public static void main(String[] args) {
			
		
		Simulation simulationR1=new Simulation();
		simulationR1.loadItems();
		ArrayList<Double> weightsOfRocket1=simulationR1.loadU1();
		double costOfR1=simulationR1.runSimulation("R1");
		System.out.println("The corresponding weights of each rockets are: "+weightsOfRocket1.toString());
		System.out.println("Total cost of the mission with rocket-R1 is: "+costOfR1+" Million CAD");
		//double costOfR1=simulationR1.runSimulation("R1");
		System.out.println("And total number of rockets launched are: "+simulationR1.getTimesOfLaunch());
		System.out.println("Out of which, the total number of rockets failed are: "+simulationR1.getTimesOfFailure());

		System.out.println("\n\n\n_________________________________________________________________________\n\n\n\n");
		
		
		
		Simulation simulationR2=new Simulation();
		simulationR2.loadItems();
		ArrayList<Double> weightsOfRocket2=simulationR2.loadU2();
		System.out.println("The corresponding weights of each rockets are: "+weightsOfRocket2.toString());
		double costOfR2=simulationR2.runSimulation("R2");
		System.out.println("Total cost of the mission with rocket-R2 is: "+costOfR2+" Million CAD");
		//double costOfR2=simulationR2.runSimulation("R2");
		System.out.println("And total number of rockets launched are: "+simulationR2.getTimesOfLaunch());
		System.out.println("Out of which, the total number of rockets failed are: "+simulationR2.getTimesOfFailure());
		
		System.out.println("\n\n_________________________________________________________________________\n\n\n");
		
		if(costOfR1<costOfR2) {
			System.out.println("As per simulation results, the Rocket-R1 is more economically feasible for the expedition.");
		}

		else if(costOfR2<costOfR1) {
			System.out.println("As per simulation results, the Rocket-R2 is more economically feasible for the expedition.");
		}

		else {
			System.out.println("As per simulation results, the rockets are equally compatible for the expedition.");
		}
			
		}
		

	}


