
public class SuperMan implements Flyer,Speed {
	
	@Override
	public void takeOff() {
		System.out.println("SuperMan 이륙");
	}
	@Override
	public void fly() {
		System.out.println("SuperMan 비행");
	}
	@Override
	public void land() {
		System.out.println("SuperMan 착륙");
	}
	@Override
	public void speed() {
		System.out.println("SuperMan speed");
		
	}
	
	
	
	
	
	
	
	
	
}
