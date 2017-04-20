package vehicle_self;

public class Car extends Vehicle{
	private double restOil;
	private int curWeight;
	
	public Car() {
		super();
	}
	public Car(int maxWeight, double oilTankSize,
			double efficiency) {
		super(maxWeight, oilTankSize, efficiency);
	}
	
	public void addOil(int oil){
		
	}
	public void moving(int distance){
		
	}
	public void addWeigt(int weight){
		
	}
	@Override
	public String toString() {
		return "Car [restOil=" + restOil
				+ ", curWeight=" + curWeight + "]";
	}
	public double getRestOil() {
		return restOil;
	}
	public void setRestOil(double restOil) {
		this.restOil = restOil;
	}
	public int getCurWeight() {
		return curWeight;
	}
	public void setCurWeight(int curWeight) {
		this.curWeight = curWeight;
	}

}//end class
