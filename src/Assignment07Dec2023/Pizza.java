package Assignment07Dec2023;

public class Pizza {
	double bill;
	
	void pizzaBill(String type,int unitCost,boolean isTopping, boolean isCheese) {
		
		int t=0;
		int c=0;
		if(type.equals("S")&&isTopping) {
			t=2;
		}
		if((type.equals("M")||type.equals("L"))&&isTopping) {
			t=3;
		}
		
		if(isCheese) {
			c=1;
		}
		
		bill=unitCost+t+c;
		
	}
	
	
		
		}
