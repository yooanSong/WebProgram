package mobileSelf;

public class Otab extends Mobile{

	public Otab() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Otab(String mobileName, int batterySize,
			String osType) {
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
