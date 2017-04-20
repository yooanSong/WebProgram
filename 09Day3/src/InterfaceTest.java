//같은거 끼리는 extends 다른거 끼리는 implements

interface AAA {
	int num = 10; // public static final 인터페이스에서 변수를 선언하면 상수화 된다

	void a(); // public abstract
}

interface BBB {
	public void b();
}

interface CCC extends BBB, AAA {
	public void c();
} // 인터페이스끼리 상속이 되고, 다중상속 가능!

class CCCImpl implements CCC {

	@Override
	public void b() {
		// TODO Auto-generated method stub

	}

	@Override
	public void a() {
		// TODO Auto-generated method stub

	}

	@Override
	public void c() {
		// TODO Auto-generated method stub

	}

}

class AAAImpe implements AAA {
	public void a() {
	}
	// num = 320; //상수 변경못한다
}

interface DDD18 {
	public static final int NUM = 10;

	public abstract void a();

	// default => 일반클래스 메서드
	public default void xx() {
		System.out.println("xx");
	}

	// static => 일반클래스 static메서드
	public static void xx2() {
		System.out.println("xx2");
	}
	// 1.8버전에서 default static 메서드 추가된거 보여주는 예

}

class DDD18Impl implements DDD18 {
	@Override
	public void a() {
	}
}

public class InterfaceTest {

	public static void main(String[] args) {
		DDD18.xx2();
		DDD18Impl x = new DDD18Impl();
		x.a();
		x.xx();

	}

}
