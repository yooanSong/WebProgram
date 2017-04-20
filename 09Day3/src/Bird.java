
public class Bird implements Flyer{ //준 상속관계 
	
	@Override
	public void takeOff() {
		System.out.println("Bird 이륙");
		
	}
	@Override
	public void fly() {
		System.out.println("Bird 비행");
		
	}
	@Override
	public void land() {
		System.out.println("Bird 착륙");
		
		
	}
	

}
