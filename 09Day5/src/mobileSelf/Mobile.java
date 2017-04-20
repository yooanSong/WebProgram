package mobileSelf;

public abstract class Mobile {
	private String mobileName;
	private int batterySize;
	private String osType;
	public Mobile() {
		super();
	}
	public Mobile(String mobileName, int batterySize, String osType) {
		super();
		this.mobileName = mobileName;
		this.batterySize = batterySize;
		this.osType = osType;
	}
	public int operate(int time){
		return operate(0);
	}
	public int charge(int time){
		return charge(0);
	}
	
	
	
	public String getMobileName() {
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public int getBatterySize() {
		return batterySize;
	}
	public void setBatterySize(int batterySize) {
		this.batterySize = batterySize;
	}
	public String getOsType() {
		return osType;
	}
	public void setOsType(String osType) {
		this.osType = osType;
	}
	

}//end class 
