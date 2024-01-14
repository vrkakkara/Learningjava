package missionMars;

public interface SpaceShip {
	
	public abstract boolean launch(double weight);
	public abstract  boolean land(double weight);
	public abstract boolean canCarry(String item);
	public abstract int carry(int weight);
	

}
