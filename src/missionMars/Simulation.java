package missionMars;
import java.awt.ItemSelectable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Simulation {
	
	private double totalWeight;
	ArrayList<Item> items=new ArrayList<Item>();
	ArrayList<Double> rocketWeights = new ArrayList<>();
	Rocket rocket=new Rocket();
	private int timesOfLaunch;
	private double totalCost;
	
	//public String rocketType;
	public ArrayList<Item> loadItems(){
	
	items.add(new Item("building tools1",2000));
	items.add(new Item("building tools2",2000));
	items.add(new Item("building tools3",2000));
	items.add(new Item("building tools4",5000));
	items.add(new Item("building tools5",5000));
	items.add(new Item("building tools6",2000));
	items.add(new Item("building tools7",1000));
	items.add(new Item("building tools8",5000));
	items.add(new Item("building tools9",6000));
	items.add(new Item("shelter equipment",5000));
	items.add(new Item("construction equipment",5000));
	items.add(new Item("plants",1000));
	items.add(new Item("steel",8000));
	items.add(new Item("books",1000));
	items.add(new Item("water",1000));
	return items;
}
	public ArrayList<Double> loadU1(){
		rocket=new R1();
		totalWeight=rocket.getRocketWeight();
		int j=0;
				for(int i=j;i<items.size();i++) {
			totalWeight=totalWeight+items.get(i).getItemWeight();
			if(totalWeight>rocket.getMaxWeight()) {
				rocketWeights.add(totalWeight-items.get(i).getItemWeight());
				j=i;
				totalWeight=rocket.getRocketWeight();	
			}
					
				}
				return rocketWeights;
		
	}
	public ArrayList<Double> loadU2(){
		rocket=new R2();
		totalWeight=rocket.getRocketWeight();
		int j=0;
				for(int i=j;i<items.size();i++) {
			totalWeight=totalWeight+items.get(i).getItemWeight();
			if(totalWeight>rocket.getMaxWeight()) {
				rocketWeights.add(totalWeight-items.get(i).getItemWeight());
				j=i;
				totalWeight=rocket.getRocketWeight();	
			}
					
				}
				return rocketWeights;
		
	}
	
	public double runSimulation(String rocketType) {
		timesOfLaunch=0;
		if(rocketType.equalsIgnoreCase("R1")) {
			rocket=new R1();
			
		}
		else if(rocketType.equalsIgnoreCase("R2")) {
			rocket=new R2();
		}
		
		for (int i=0;i<rocketWeights.size();i++) {
			if((rocket.launch(rocketWeights.get(i)))&& (rocket.land(rocketWeights.get(i)))){
				timesOfLaunch++;
			}
			else  {
				timesOfLaunch+=2;
			}
		}
		totalCost=timesOfLaunch*rocket.getRocketCost();
		return totalCost;
	}
	public int getTimesOfLaunch() {
		return timesOfLaunch;
	}
	
}
