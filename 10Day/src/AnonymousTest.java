//interface 및 추상클래스 사용시 많이 사용함 
interface Flyer {
	public void takeOff();
}// end

// 가. 이름있는 클래스로 인터페이스 사용하는 방법
class Bird implements Flyer {
	@Override
	public void takeOff() {
	}
}

public class AnonymousTest {
	public static void main(String[] args) {
		// 가. 이름있는 클래스
		Bird b = new Bird(); // 객체생성한것
		b.takeOff(); // 메서드 호출하면 9라인으로 올라
		// 가야 되는데 이름없는 클래스는 안에 들어있어 가독성 높다

		// 나. 이름없는 클래스
		/*
		 * 인터페이스명 변수명 = new 인터페이스명(){ 오버라이딩 메서드 };
		 */
		Flyer f2 = new Flyer() {
			@Override
			public void takeOff() {
				System.out.println("takeOff");
			}
		};
		f2.takeOff();

		Flyer f3 = new Flyer() {
			@Override
			public void takeOff() {
				System.out.println("");
			}
		};

	}// main end

}
