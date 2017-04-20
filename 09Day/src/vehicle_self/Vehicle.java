package vehicle_self;

public class Vehicle {
	private int maxWeight;
	private double oilTankSize;
	private double efficiency;
	
	public Vehicle() {
		super();
	}//end 기본생성자 

	public Vehicle(int maxWeight, 
			double oilTankSize, double efficiency)
	{
		super();
		this.maxWeight = maxWeight;
		this.oilTankSize = oilTankSize;
		this.efficiency = efficiency;
	}//end 인자있는 생성자 

	@Override
	public String toString() {
		return "Vehicle [maxWeight="
	+ maxWeight + ", oilTankSize=" + oilTankSize 
	+ ", efficiency=" + efficiency + "]";
	}//end toString

	public int getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}

	public double getOilTankSize() {
		return oilTankSize;
	}

	public void setOilTankSize(double oilTankSize)
	{
		this.oilTankSize = oilTankSize;
	}

	public double getEfficiency() {
		return efficiency;
	}

	public void setEfficiency(double efficiency)
	{
		this.efficiency = efficiency;
	}
	
}//end class
