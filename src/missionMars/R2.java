package missionMars;

public class R2 extends Rocket{
	private int rocketCost=120;
	private double rocketWeight=18000;
	private double maxWeight=29000;
	private double totalWeight;
	private double probabilityLaunchExplosion=.04;
	private double probabilityLandingExplosion=.08;
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
