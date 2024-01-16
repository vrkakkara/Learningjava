package missionMars;

public class Rocket implements SpaceShip{
	double rocketWt;
	double maxWt;
	int costOfRocket;

	@Override
	public boolean launch(double totalWeight) {
		
		return true;
	}

	@Override
	public boolean land(double totalWeight) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean canCarry(double totalWeight,double itemWeight) {
		totalWeight=totalWeight+itemWeight;
		if(totalWeight<=getMaxWeight()) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public double carry(double totalWeight,double itemWeight) {
		totalWeight=totalWeight+itemWeight;
        return totalWeight;
		
		
		
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
