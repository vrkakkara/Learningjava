package missionMars;

public class Rocket implements SpaceShip{
	double rocketWt;
	double maxWt;
	int costOfRocket;

	@Override
	public boolean launch(double totalWeight) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean land(double totalWeight) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean canCarry(String item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int carry(int weight) {
		
		return 0;
	}
	public double getRocketWeight() {
		return rocketWt;
	}
	public double getMaxWeight() {
		return maxWt;
	}
	public int getRocketCost() {
		return costOfRocket;
	}
	
	
}
