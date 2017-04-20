package vehicle_self;

public class Truck extends Car{
	
	public Truck() {
		super();
	}

	public Truck(int maxWeight, double oilTankSize,
			double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
	}
	/*public double getEfficiency(){		
	}
	public void moving(int distance){
		
	}
	private double calcOil(int distance){
		
	}
	public int getCost(int distance){
		return calcOil 
	}*/

	@Override
	public String toString() {
		return "Truck [getEfficiency()=" + getEfficiency() + "]";
	}
	
	
	

	
	
	
	
	
	
}//end class
