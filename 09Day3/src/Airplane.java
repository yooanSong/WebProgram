
public class Airplane implements Flyer,Speed {
	@Override
	public void takeOff(){
		System.out.println("Airplane 이륙");
	}
	@Override
	public void fly(){
		System.out.println("Airplane 비행");
	}
	@Override
	public void land(){
		System.out.println("Airplane 착륙");
	}
	@Override
	public void speed() {
		System.out.println("Airplane speed");
		
	}
}
