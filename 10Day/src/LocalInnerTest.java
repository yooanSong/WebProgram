class Outer2 {
	int a = 10;
	private int b = 20;
	static int c = 40;
	

	public void aaa() { // 메서드
		int y = 20;
		class Inner2 { // 메서드 안에 local inner class
			int x = 10;

			// static int y =20;
			public void print() {
				System.out.println(a);
				System.out.println(b); // b는 private인데 접근 가능!
				System.out.println(c);
				System.out.println(x);
				System.out.println(y);
			}// end Inner2
				// Inner생성
				// 로컬변수니깐 aaa변수 안에서 생성하고 삭제된다
		}
		Inner2 i = new Inner2();
		i.print();
	}// end aaa
}// end Outer

public class LocalInnerTest {

	public static void main(String[] args) {
		Outer2 o2 = new Outer2();
		o2.aaa();
	}// end main
}// end class
