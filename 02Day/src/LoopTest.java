
public class LoopTest {

	public static void main(String[] args) {
		// for문
		for (int i = 0; i < 10; i++) {
			System.out.println("hello" + i);
		}
		System.out.println("===================");
		// while문
		int i = 0;
		while (i < 10) {
			System.out.println("world" + i);
			i++;
		}
		System.out.println("===================");
		// do while문
		int k = 0;
		do {
			System.out.println("happy" + k);
			k++;
		} while (k < 10);

	}
}
