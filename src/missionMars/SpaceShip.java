package missionMars;

public interface SpaceShip {
	
	public abstract boolean launch(double weight);
	public abstract  boolean land(double weight);
	public abstract boolean canCarry(double totalWeight,double itemWeight);
	public abstract double carry(double totalWeight,double itemWeight);
	

}
