
//finally 
public class ExceptionTest4 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		
		try {
			System.out.println(1);
			System.out.println(2);

			
		}finally {
			System.out.println("반드시 수행");
		} 
		System.out.println("프로그램 정상종료");
	}
}
