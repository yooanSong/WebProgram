//다중 catch문 
public class ExceptionTest2 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		try {
			int n = 10;
			int n2 = n / 2;
			System.out.println(n2);

			String name = null;
			System.out.println(name.length());
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException 예외발생");
		} catch (NullPointerException e) {
			System.out.println("NullPointerException 예외발생");		
		}
		System.out.println("프로그램 정상종료");
	}
}
