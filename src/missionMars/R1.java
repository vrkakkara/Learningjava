package missionMars;

public class R1 extends Rocket{
	
	private int rocketCost=100;
	private double rocketWeight=10000;
	private double maxWeight=18000;
	private double totalWeight;
	private double probabilityLaunchExplosion=.05;
	private double probabilityLandingExplosion=.01;
	private double chanceOfLaunchFailure;
	private double chanceOfLandingFailure;

	@Override
	public boolean launch(double weight) {
		
		chanceOfLaunchFailure=probabilityLaunchExplosion*(weight/maxWeight);
		
		if(chanceOfLaunchFailure>0.045) {
			return false;
		}
		else {
			return true;
		}
		
	}

	@Override
	public boolean land(double weight) {
		chanceOfLandingFailure=probabilityLandingExplosion*(weight/maxWeight);
		
		if(chanceOfLandingFailure>0.04) {
			return false;
		}
		else {
			return true;
		}
	}

	public int getRocketCost() {
		return rocketCost;
	}

	public double getRocketWeight() {
		return rocketWeight;
	}

	public double getMaxWeight() {
		return maxWeight;
	}

	public double getProbabilityLaunchExplosion() {
		return probabilityLaunchExplosion;
	}

	public double getProbabilityLandingExplosion() {
		return probabilityLandingExplosion;
	}


}
