package missionMars;
import java.util.ArrayList;
import java.util.Scanner;
public class MissionMain {

	public static void main(String[] args) {
		System.out.println("The simulation is run based on the assumption that, Rocket is considered fail if the chance of launch clash is more than 4.5%\n And, landing is considered fail if the chance of landing clash is more than 4%\n\n");
		
		
		Simulation simulationR1=new Simulation();
		simulationR1.loadItems();
		ArrayList<Double> weightsOfRocket1=simulationR1.loadU1();
		System.out.println("Total cost of the mission with rocket-R1 is: "+simulationR1.runSimulation("R1")+" Million CAD");
		System.out.println("And total number of rockets launched are: "+simulationR1.getTimesOfLaunch());
		System.out.println("And the corresponding weights of each rockets are: "+weightsOfRocket1.toString());
		System.out.println("\n\n\n_________________________________________________________________________\n\n\n\n");
		Simulation simulationR2=new Simulation();
		simulationR2.loadItems();
		ArrayList<Double> weightsOfRocket2=simulationR2.loadU2();
		System.out.println("Total cost of the mission with rocket-R2 is: "+simulationR2.runSimulation("R2")+" Million CAD");
		System.out.println("And total number of rockets launched are: "+simulationR2.getTimesOfLaunch());
		System.out.println("And the corresponding weights of each rockets are: "+weightsOfRocket2.toString());
		

	}

}
