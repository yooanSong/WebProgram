package mobileSelf;

public class Ltab extends Mobile{

	public Ltab() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ltab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
		// TODO Auto-generated constructor stub
	}
	
	public int operate (int time){
		return operate(0);
	}
	public int charge (int time){
		return charge(0);
	}
	

}
